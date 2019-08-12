package com.youyou.web.controller;


import com.youyou.web.comm.ResultModel;
import com.youyou.web.dao.model.Data;
import com.youyou.web.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private IDataService dataService;

    @GetMapping("list")
    public ResultModel queryDataList(){

        List<Data> data = dataService.queryDataList();

        return ResultModel.ok().put("data", data);
    }

}
