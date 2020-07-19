package com.kiki.crm.dao;

import com.kiki.crm.domain.Activity;
import com.kiki.crm.domain.Clue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ClueDao extends Mapper<Clue> {

    Clue findClueActivityById(String id);

    List<Activity> findActivity(String id);

}
