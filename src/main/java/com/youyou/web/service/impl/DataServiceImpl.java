package com.youyou.web.service.impl;

import com.youyou.web.dao.mapper.DataMapper;
import com.youyou.web.dao.model.Data;
import com.youyou.web.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataServiceImpl implements IDataService {

    @Autowired
    private DataMapper dataMapper;

    @Override
    public List<Data> queryDataList() {

        List<Data> list = dataMapper.queryLatestByFuncNo();
        if (list.isEmpty()){
            return null;
        }
        for (Data data : list) {
            if (data.getCode()==1){

            }
        }
        return dataMapper.queryLatestByFuncNo();
    }
}
