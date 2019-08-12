package com.youyou.web.dao.mapper;

import com.youyou.web.dao.model.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DataMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Data record);

    int insertSelective(Data record);

    Data selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Data record);

    int updateByPrimaryKey(Data record);

    List<Data> queryLatestByFuncNo();
}