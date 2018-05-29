package per.sn.mini.o.core.repository;

import org.springframework.stereotype.Repository;

import per.sn.mini.o.core.entity.Demo;

@Repository
public interface DemoMapper {
	int deleteByPrimaryKey(String id);

	int insert(Demo record);

	int insertSelective(Demo record);

	Demo selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Demo record);

	int updateByPrimaryKey(Demo record);
}