package per.sn.mini.o.app.service;

import org.springframework.stereotype.Service;

import per.sn.mini.o.api.dto.DemoDto;

@Service
public class DemoService {

	public String sayHello(String name) {
		return "hello, " + name;
	}

	public String sayHello(DemoDto dto) {
		return "hello, " + dto.getName();
	}

}
