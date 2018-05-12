package per.sn.mini.o.app.vo;

import javax.ws.rs.QueryParam;

public class DemoVo {

	@QueryParam("id")
	private String id;

	@QueryParam("name")
	private String name;

	@QueryParam("age")
	private Integer age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
