package per.sn.mini.o.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import per.sn.mini.o.api.dto.DemoDto;
import per.sn.mini.o.api.service.DemoService;
import per.sn.mini.o.web.vo.DemoVo;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private DemoService demoBiz;

	@ResponseBody
	@RequestMapping(value = "/getParam", method = RequestMethod.GET)
	public String getParam(String name) {
		return demoBiz.sayHello(name);
	}

	@ResponseBody
	@RequestMapping(value = "/getBeanParam", method = RequestMethod.GET)
	public String getBeanParam(DemoVo vo) {
		DemoDto dto = new DemoDto();

		return demoBiz.sayHello(dto);
	}

	@ResponseBody
	@RequestMapping(value = "/postParam", method = RequestMethod.POST)
	public String postParam(String name) {
		return demoBiz.sayHello(name);
	}

	@ResponseBody
	@RequestMapping(value = "/postBeanParam", method = RequestMethod.POST)
	public String postBeanParam(DemoVo vo) {
		DemoDto dto = new DemoDto();

		return demoBiz.sayHello(dto);
	}

}
