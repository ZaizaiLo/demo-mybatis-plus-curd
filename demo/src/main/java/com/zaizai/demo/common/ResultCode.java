package com.zaizai.demo.common;

/**
 * @Decription
 * @Author ZaiZai
 * @Date 2020/11/4 11:40
 */
public class ResultCode {
    private ResultCode() {
    }

    /**
     * 未登录
     */
    public static final String NO_LOGIN = "04";

    /**
     * 系统错误
     */
    public static final String SYSTEM_ERROR = "02";

    /**
     * 未绑定
     */
    public static final String NO_BINDS = "0500";

    /**
     * 用电户号未登录
     */
    public static final String ELEC_NUMBER_NO_LOGIN = "0401";

    /**
     * 无工单权限
     */
    public static final String NO_AUTH_WORK = "510";

    /**
     * 成功
     */
    public static final String SUCCESS = "00";

    /**
     * 参数异常
     */
    public static final String PARAMS_ERROR = "01";

    /**
     * 没有注册
     */
    public static final String NO_REGISTERED = "05";

    /**
     * 次数限制
     */
    public static final String TIMES_LIMIT = "07";

    /**
     * 没有数据
     */
    public static final String NO_DATA = "09";

    /**
     * 网络调用异常
     */
    public static final String MS_HTTP_ERROR = "404";

    public static final String VERIFY_FALIE = "0006";

    /**
     * 重复数据
     */
    public static final String SAME_COMMIT = "98888889";

    /**
     * 短信验证码错误
     */
    public static final String VERIFY_CODE_ERROR = "06";

    /**
     * session中查不到数据，redis中数据超时失效
     */
    public static final String SESSION_NO_DATA = "0409";

    /**
     * 登录替换同一用户的旧的session时，旧的用户再次访问请求的响应代码
     */
    public static final String DEL_OLD_SESSION = "0408";

    /**
     * 对应客服获取用户绑定列表接口-没有查询到用电户号信息代码
     */
    public static final String NO_QUERY_BIND_ELE_USERS = "00030003";

    public static final String NO_QUERY_BIND_ELE_USER_NO_DATA = "00030015";

    /**
     * 当天手机号总发送次数限制
     */
    public static final String SEND_NUMBER_LOCK = "00040004";

    /**
     * 验证码key
     */
    public static final String SEND_MSG_ERR_FIVE = "SEND_MSG_ERR_FIVE";

    // 发送验证码ip限制
    public static final String SEND_MSG_IP_CONFIG = "SEND_MSG_IP_CONFIG";

    /**
     * 120发送次数
     */
    public static final String SEND_MSG_TIME_NUMBER = "SEND_MSG_TIME_NUMBER";

    public static final String SEND_MSG_KEY_LOCK = "SEND_MSG_KEY_LOCK";

    /**
     * 取验证码过于频繁，连续获取第9次，则锁定当天23点59分59秒之前不能获取验证码
     */
    public static final String SEND_MSG_GET_NEIE = "SEND_MSG_GET_NEIE";

    public static final String SEND_PWD_GET_THREE = "SEND_PWD_GET_THREE";// 密码错误三次

    public static final String SEND_PWD_GET_FIVE = "SEND_PWD_GET_FIVE";// 密码错误五次

    public static final String SEND_PWD_GET_NEIE = "SEND_PWD_GET_NEIE";// 密码错误九次

    public static final String FIVE = "5";

    public static final String NEIE = "9";

    public static final String ERR_FIVE = "0005";

    public static final String SEND_TIME = "0120";

    public static final String GET_NEIE = "0009";

    public static final String ERR_THREE = "0003";

    public static final String ERR_FIVE_TIME = "03005";

    public static final String ERR_NEIE_TIME = "03009";

    /**
     * 成功校验的手机号key
     */
    public static final String VERIFY_CODE_PHONE_NUMBER = "VERIFY_CODE_PHONE_NUMBER";

    /**
     * 二次校验手机验证码的错误码
     */
    public static final String VERIFY_CODE_PHONE_NUMBER_ERROR_CODE = "0041";

    /**
     * 手机号查询工单成功校验的手机号key
     */
    public static final String PHONE_QUERY_WORK_NUMBER_VERIFY_CODE_NUMBER =
            "PHONE_QUERY_WORK_NUMBER_VERIFY_CODE_NUMBER";

    /**
     * 手机号查询工单二次校验手机验证码的错误码
     */
    public static final String PHONE_QUERY_WORK_NUMBER_VERIFY_CODE_ERROR_CODE = "0042";

    /**
     * 工单详情生成的token保存redis的key的前缀
     */
    public static final String WORK_ORDER_VERIFY_CODE_TOKEN = "WORK_ORDER_VERIFY_CODE_TOKEN";

    /**
     * 工单详情生成的token校验失败
     */
    public static final String WORK_ORDER_VERIFY_CODE_TOKEN_ERROR_CODE = "0043";

    /**
     * 工单提交，工单号校验失败
     */
    public static final String SUBMIT_BIZ_CHANGE_ELE_CUST_NUMBER_CHECK_ERROR_CODE = "521";

    /**
     * 订阅手机号和邮箱保存
     */
    public static final String BINDING_ID_PHONE = "BINDING_ID_PHONE";

    public static final String BINDING_ID_EMAIL = "BINDING_ID_EMAIL";

    public static final String DATE_PATTERN_DAY = "yyyy-MM-dd";

    public static final String DATE_PATTERN_TIMESTAMP = "yyyy-MM-dd HH:mm:ss";

    /**
     * 建议反馈手机号提交次数限制key
     */
    public static final String FEED_BACK_COMMIT = "FEED_BACK_COMMIT";

    public static final String SEND_MSG_COUNT_NUMBER = "SEND_MSG_COUNT_NUMBER";

    public static final String IS_CONFIRM_LOGIN = "IS_CONFIRM_LOGIN";

    // 校验用电户信息发送次数key
    public static final String VERIFY_ELE_FALIE_NUMBER = "VERIFY_ELE_FALIE_NUMBER";

    // 校验用电户失败次数过多锁定
    public static final String ELE_FALISE_LOCK = "0410";

    // 校验用户信息锁关键字
    public static final String ELE_KEY_LOCK = "ELE_KEY_LOCK";

    public static final String VC_TYPE_ONE = "1";

    public static final String VC_TYPE_TWO = "2";

    public static final String VC_TYPE_THREE = "3";

    public static final String VC_TYPE_FOUR = "4";

    public static final String VC_TYPE_FIVE = "5";

    public static final String VC_TYPE_SIX = "6";

    public static final String VC_TYPE_SERVIE = "7";

    public static final String VC_TYPE_ENITH = "8";

    public static final String SZ_AREA_CODE = "090000";
}
