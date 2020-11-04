package com.zaizai.demo.common;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/4 10:49
 */
@ToString
@ApiModel(value = "全局返回对象")
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResultModel<T> implements Serializable {

    @Getter
    private String status;

    @Getter
    private String message;

    @Getter
    private T data;

    @JsonIgnore
    public boolean isSuccess() {
        return this.status.equals(CodeNums.SUCCESS.getCode());
    }

    /**
     * 私有构造器
     */
    public ResultModel(String status) {
        this.status = status;
    }

    public ResultModel(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResultModel(String status, String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * 成功的构造器
     */
    public static <T> ResultModel<T> success() {
        return new ResultModel<>(CodeNums.SUCCESS.getCode());
    }

    public static <T> ResultModel<T> successMessage(String message) {
        return new ResultModel<>(CodeNums.SUCCESS.getCode(), message);
    }

    public static <T> ResultModel<T> success(T data) {
        return new ResultModel<>(CodeNums.SUCCESS.getCode(), "ok", data);
    }

    public static <T> ResultModel<T> success(String message, T data) {
        return new ResultModel<>(CodeNums.SUCCESS.getCode(), message, data);
    }


    public static <T> ResultModel<T> resultCodeMsgData(String code, String message, T data) {
        return new ResultModel<>(code, message, data);
    }

    public static <T> ResultModel<T> resultCodeMsgData(String code, String message) {
        return new ResultModel<>(code, message);
    }

    /**
     * 失败的构造器
     */
    public static <T> ResultModel<T> error(String errorMessage) {
        return new ResultModel<>(CodeNums.SYSTEM_ERROR.getCode(), errorMessage);
    }

    public static <T> ResultModel<T> errorStack(String errorMessage, T data) {
        return new ResultModel<>(CodeNums.ERROR.getCode(), errorMessage, data);
    }

    public static <T> ResultModel<T> msError(String errorMessage) {
        return new ResultModel<>(CodeNums.MS_ERROR.getCode(), errorMessage);
    }

    public static <T> ResultModel<T> paramsError(String errorMessage) {
        return new ResultModel<>(CodeNums.PARAMS_ERROR.getCode(), errorMessage);
    }

    public static <T> ResultModel systemError(String errorMessage) {
        return new ResultModel<>(CodeNums.SYSTEM_ERROR.getCode(), errorMessage);
    }

    public static <T> ResultModel<T> resultCodeZtException(String errorMessage) {
        return new ResultModel<>(CodeNums.RESULT_CODE_ZT_EXCEPTION.getCode(), errorMessage);
    }

    public static <T> ResultModel<T> msAppResponseToOpenRest(MsAppResponse response, Class<T> tClass) {
        if (response == null) {
            return ResultModel.msError("respone is null");
        } else if (response.getSta() == null) {
            return ResultModel.msError("调用接口异常，支付码返回为null");
        } else if (StringUtils.equals(ResultCode.SUCCESS, response.getSta())) {
            String objJson = JSON.toJSONString(response.getData());
            T object = JSON.parseObject(objJson, tClass);
            return ResultModel.resultCodeMsgData(response.getSta(), response.getMessage());
        } else {
            return ResultModel.resultCodeMsgData(response.getSta(), response.getMessage());
        }
    }

    public static <T> ResultModel<List<T>> msAppResponseToResultModelList(MsAppResponse response, Class<T> tClass) {
        if (response == null) {
            return ResultModel.msError("response is null");
        } else if (response.getSta() == null) {
            return ResultModel.msError("调用接口异常，状态码返回为null");
        } else if (StringUtils.equals(ResultCode.SUCCESS, response.getSta())) {

            String objJson = JSON.toJSONString(response.getData());
            List<T> object = JSON.parseArray(objJson, tClass);
            return ResultModel.resultCodeMsgData(response.getSta(), response.getMessage(), object);
        } else {
            return ResultModel.resultCodeMsgData(response.getSta(), success().getMessage());
        }
    }


}
