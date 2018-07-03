package per.sn.mini.o.app.base;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 * BusinessExceptionMapper
 */
@Provider
public class BusinessExceptionMapper extends AbstractExceptionMapper<BusinessException> {

	public Response toResponse(BusinessException e) {
		logger.error(e.getMessage());
		IReturnCode returnCode = e.getReturnCode();
		String message = returnCode.getMessage();
		Result result = Result.fail(returnCode.getCode(), message);
		return buildErrResponse(result);
	}

}
