package per.sn.mini.o.app.base;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 * IllegalParamsExceptionMapper
 */
@Provider
public class IllegalParamsExceptionMapper extends AbstractExceptionMapper<IllegalParamsException> {

	public Response toResponse(IllegalParamsException e) {
		IReturnCode returnCode = e.getReturnCode();
		if (returnCode == null)
			returnCode = BaseReturnCode.ILLEGAL_PARAMS_ERROR;
		String message = returnCode.getMessage();
		Result result = Result.fail(returnCode.getCode(), message);
		return buildErrResponse(result);
	}

}
