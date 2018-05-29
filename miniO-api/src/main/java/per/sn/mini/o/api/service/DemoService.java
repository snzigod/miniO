package per.sn.mini.o.api.service;

import per.sn.mini.o.api.dto.DemoDto;

public interface DemoService {

	public String sayHello(String name);

	public String sayHello(DemoDto dto);

}
