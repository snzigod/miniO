package per.sn.mini.o.app.base;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class ResponseWrapperFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext containerRequestContext,
			ContainerResponseContext containerResponseContext) throws IOException {
		Object data = containerResponseContext.getEntity();
		System.out.println("==========end============");
		buildResultResponse(containerResponseContext, data);
	}

	private void buildResultResponse(ContainerResponseContext containerResponseContext, Object data) {
		if (data == null)
			containerResponseContext.setStatus(Response.Status.OK.getStatusCode());
		if (!(data instanceof Result)) {
			data = Result.success(data);
		}
		String jsonResult = GsonUtil.toJson(data);
		if (containerResponseContext.getMediaType() == null) {
			containerResponseContext.setEntity(jsonResult, containerResponseContext.getEntityAnnotations(),
					MediaType.APPLICATION_JSON_TYPE);
		} else {
			containerResponseContext.setEntity(jsonResult, containerResponseContext.getEntityAnnotations(),
					containerResponseContext.getMediaType());
		}
	}

}
