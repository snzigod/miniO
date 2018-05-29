package per.sn.mini.o.core.service;

import org.springframework.stereotype.Service;

import per.sn.mini.o.api.dto.DemoDto;
import per.sn.mini.o.api.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "hello, " + name;
	}

	@Override
	public String sayHello(DemoDto dto) {
		return "hello, " + dto.getName();
	}

}
