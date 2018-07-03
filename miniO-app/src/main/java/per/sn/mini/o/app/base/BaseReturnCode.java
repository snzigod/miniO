package per.sn.mini.o.app.base;

public enum BaseReturnCode implements IReturnCode {

    NORMAL_RETURN(0, "invoke success"),
    BASE_BAD_REQUEST(40400, "invalid url"),
    BASE_NOT_FOUND(40404, "invalid resource request"),
    BASE_NOT_ALLOWED(40405, "invalid method"),
    BASE_NOT_SUPPORTED(40415, "invalid media-type"),
    BASE_INTERNAL_SERVER_ERROR(40500, "internal server error"),
    ILLEGAL_PARAMS_ERROR(40200, "params illegal error"),
    SYSTEM_ERROR(40900, "system internal error"),
    BASE_PARAM_NULL(40001, "App auth : Base Parameters can not be null"),
    BASE_PARAM_PARSE_WRONG(40002, "App auth : Base Parameters parse exception"),
    BASE_PARAM_NULL_TIMESTAMP(40003, "App auth : Parameter timestamp doesn't exist"),
    BASE_PARAM_NULL_TOKEN(40004, "App auth : Parameter token doesn't exist"),
    BASE_PARAM_NULL_SIGN(40005, "App auth : Parameter sign doesn't exist"),
    APP_TOKEN_EXPIRE(40007, "APP Token过期，请重新登录"),
    TOKEN_TEMPLATE_NOT_FOUND(40008, "TokenManager对象未注入, 请在applicationContext.xml中定义TokenManager."),;

    private int code;
    private String message;

    BaseReturnCode(int statusCode, String message) {
        this.code = statusCode;
        this.message = message;
    }

    public static String getMessage(int code) {
        for (BaseReturnCode c : BaseReturnCode.values()) {
            if (c.getCode() == code) {
                return c.message;
            }
        }
        return "";
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
