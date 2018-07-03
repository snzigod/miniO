package per.sn.mini.o.app.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * AbstractExceptionMapper
 */
public abstract class AbstractExceptionMapper<E extends Throwable> implements ExceptionMapper<E> {
	protected static Logger logger = LoggerFactory.getLogger(AbstractExceptionMapper.class);

	protected static final Status DEFAULT_ERROR_STATUS;
	public static final String APPLICATION_JSON_UTF_8 = "application/json; charset=utf-8";

	public AbstractExceptionMapper() {
	}

	public abstract Response toResponse(E var1);

	protected Response buildErrResponse(Object entity) {
		return this.buildErrResponse(entity, DEFAULT_ERROR_STATUS);
	}

	protected Response buildErrResponse(Object entity, Status status) {
		ResponseBuilder rb = Response.status(status);
		rb.entity(entity);
		rb.type(APPLICATION_JSON_UTF_8);
		Response response = rb.build();
		return response;
	}

	static {
		DEFAULT_ERROR_STATUS = Status.OK;
	}

}
