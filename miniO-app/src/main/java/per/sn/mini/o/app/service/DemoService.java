package per.sn.mini.o.app.service;

import org.springframework.stereotype.Service;

import per.sn.mini.o.app.vo.DemoVo;

@Service
public class DemoService {

	public String sayHello(String name) {
		return "hello, " + name;
	}

	public String sayHello(DemoVo vo) {
		return "hello, " + vo.getName();
	}

}
