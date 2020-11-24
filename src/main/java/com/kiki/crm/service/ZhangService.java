package com.kiki.crm.service;

import com.kiki.crm.dao.ZhangDao;
import com.kiki.crm.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhangService {

    @Autowired
    private ZhangDao zhangDao;


    public List<Category> categoryOne() {
        return zhangDao.findCategoryOne();
    }
}
