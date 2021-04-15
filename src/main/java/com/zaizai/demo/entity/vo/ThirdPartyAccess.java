package com.zaizai.demo.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(description = "第三方登录入参信息")
@Data
public class ThirdPartyAccess implements Serializable {

    @ApiModelProperty(value = "授权码")
    private String code;

    @ApiModelProperty(value = "类型：微信2，支付宝3,掌厅4")
    private String type;

}
