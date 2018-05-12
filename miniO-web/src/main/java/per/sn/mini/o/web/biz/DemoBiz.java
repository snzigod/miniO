package per.sn.mini.o.web.biz;

import org.springframework.stereotype.Service;

import per.sn.mini.o.web.vo.DemoVo;

@Service
public class DemoBiz {

	public String sayHello(String name) {
		return "hello, " + name;
	}

	public String sayHello(DemoVo vo) {
		return "hello, " + vo.getName();
	}

}
