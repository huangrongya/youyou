package com.youyou.web.dao.model;

import java.io.Serializable;
import java.util.Date;

/**
 * data
 * @author 
 */
@lombok.Data
public class Data implements Serializable {
    private String uuid;

    private String date;

    private Integer appNo;

    private Integer funNo;

    private Integer code;

    private Integer status;

    private String content;

    private Integer sum;

    private Double money;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

}