package com.kiki.crm.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class ActivityAllVO {

    private String id;
    private String owner;
    private String startDate;
    private String endDate;
    private String cost; //成本
    private String description;
    private String creatTime;
    private String creatBy;
    private String editTime;
    private String editBy;
    private String name;

    private List<ActivityRemark> activityRemarkList;


}
