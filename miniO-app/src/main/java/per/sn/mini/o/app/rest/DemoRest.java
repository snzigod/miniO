package per.sn.mini.o.app.rest;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;

import per.sn.mini.o.app.service.DemoService;
import per.sn.mini.o.app.vo.DemoVo;

@Path("demo")
public class DemoRest {

	@Autowired
	private DemoService demoService;

	@GET
	@Path("getPathParam/{name}")
	public String getPathParam(@PathParam("name") String name) {
		return demoService.sayHello(name);
	}

	@GET
	@Path("getQueryParam")
	public String getQueryParam(@QueryParam("name") String name) {
		return demoService.sayHello(name);
	}

	@GET
	@Path("/getBeanParam")
	public String getBeanParam(@BeanParam DemoVo vo) {
		return demoService.sayHello(vo);
	}

	@POST
	@Path("/postFormParam")
	public String doPostForm(@FormParam("name") String name) {
		return demoService.sayHello(name);
	}

	@POST
	@Path("/postQueryParam")
	public String postQueryParam(@QueryParam("name") String name) {
		return demoService.sayHello(name);
	}

	@POST
	@Path("/postBeanParam")
	public String postBeanParam(@BeanParam DemoVo vo) {
		return demoService.sayHello(vo);
	}

}
