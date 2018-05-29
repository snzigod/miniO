package per.sn.mini.o.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.sn.mini.o.api.dto.DemoDto;
import per.sn.mini.o.api.service.DemoService;
import per.sn.mini.o.core.repository.DemoMapper;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper demoMapper;

	@Override
	public String sayHello(String name) {
		return "hello, " + demoMapper.selectByPrimaryKey("1").getName();
	}

	@Override
	public String sayHello(DemoDto dto) {
		return "hello, " + demoMapper.selectByPrimaryKey("1").getName();
	}

}
