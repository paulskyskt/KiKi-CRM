package com.kiki.crm.domain;

import lombok.Data;

@Data
public class Category {
    private Integer id ;
    private String name;
    private Integer parentId;

}
