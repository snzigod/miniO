package per.sn.mini.o.app.biz;

import org.springframework.stereotype.Service;

import per.sn.mini.o.app.vo.DemoVo;

@Service
public class DemoBiz {

	public String sayHello(String name) {
		return "hello, " + name;
	}

	public String sayHello(DemoVo vo) {
		return "hello, " + vo.getName();
	}

}
