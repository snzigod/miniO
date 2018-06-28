package per.sn.mini.o.app.base;

public class Result {

    private boolean flag;

    private int code;

    private String message;

    private Object data;

    public Result() {

    }

    public static Result success(Object o) {
        int code = BaseReturnCode.NORMAL_RETURN.getCode();
        String message = BaseReturnCode.getMessage(code);
        return success(code, message, o);
    }

    public static Result success(int code, String message, Object o) {
        Result result = new Result();
        result.setFlag(true);
        result.setCode(code);
        result.setMessage(message);
        result.setData(o);
        return result;
    }

    public static Result fail(int code) {
        return fail(code, BaseReturnCode.getMessage(code));
    }

    public static Result fail(int code, String message) {
        Result result = new Result();
        result.setFlag(false);
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);
        return result;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
