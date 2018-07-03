package per.sn.mini.o.app.base;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 * ExceptionsMapper
 */
@Provider
public class ExceptionsMapper extends AbstractExceptionMapper<Exception> {

	public Response toResponse(Exception e) {
		logger.error("系统内部异常:", e);
		int code = BaseReturnCode.SYSTEM_ERROR.getCode();
		String message = e.getMessage();
		Result result = Result.fail(code, message);
		return buildErrResponse(result);
	}

}
