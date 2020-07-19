package com.kiki.crm.domain;

import lombok.Data;

import javax.persistence.Table;
import java.util.List;


@Table(name = "tbl_clue")
@Data
public class Clue {

  private String id;
  private String fullname;
  private String appellation;
  private String owner;
  private String company;
  private String job;
  private String email;
  private String phone;
  private String website;
  private String mphone;
  private String state;
  private String source;
  private String createBy;
  private String creatTime;
  private String address;
  private List<Activity> activityList;


}
