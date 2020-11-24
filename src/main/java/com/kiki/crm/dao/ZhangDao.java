package com.kiki.crm.dao;

import com.kiki.crm.domain.Category;
import com.kiki.crm.domain.Zhang;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ZhangDao extends Mapper<Zhang> {

    List<Category> findCategoryOne();

}
