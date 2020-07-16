package com.kiki.crm.dao;

import com.kiki.crm.domain.Activity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ActivityDao extends Mapper<Activity> {

    List<Activity> findAll();

    void add(Activity activity);
}
