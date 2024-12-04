package org.example.mapper;

import org.example.model.TestDO;

public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestDO record);

    int insertSelective(TestDO record);

    TestDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestDO record);

    int updateByPrimaryKey(TestDO record);
}