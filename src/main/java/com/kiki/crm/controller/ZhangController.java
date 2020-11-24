package com.kiki.crm.controller;

import com.kiki.crm.domain.Category;
import com.kiki.crm.pojo.LayResult;
import com.kiki.crm.service.ZhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;
import java.util.List;

@RestController
public class ZhangController {

    @Autowired
    private ZhangService zhangService;

    /**
     * 查询所有一级分类
     * @return
     */
    @GetMapping("/z/category/1")
    public LayResult category(){
        List<Category> categoryList = zhangService.categoryOne();
        return new LayResult(200,categoryList);
    }
}
