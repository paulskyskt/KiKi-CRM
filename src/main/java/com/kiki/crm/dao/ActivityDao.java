package com.kiki.crm.dao;

import com.kiki.crm.domain.Activity;
import com.kiki.crm.domain.ActivityRemark;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ActivityDao extends Mapper<Activity> {

    List<Activity> findAll();

    void add(Activity activity);

    void edit(Activity activity);

    Activity findById(String id);

    List<ActivityRemark> findRemarkById(String id);

}
