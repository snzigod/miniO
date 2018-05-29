package per.sn.mini.o.core.repository;

import per.sn.mini.o.core.entity.Demo;

public interface DemoMapper {
	int deleteByPrimaryKey(String id);

	int insertSelective(Demo record);

	Demo selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Demo record);
}