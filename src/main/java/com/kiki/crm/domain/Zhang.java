package com.kiki.crm.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Zhang {
    private Integer id;
    private Integer categoryId;
    private Integer outAndIput;
    private Integer money;
    private String remark ;
    private Date time;
}
