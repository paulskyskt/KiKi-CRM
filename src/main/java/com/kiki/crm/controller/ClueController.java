package com.kiki.crm.controller;

import com.kiki.crm.domain.Clue;
import com.kiki.crm.pojo.LayResult;
import com.kiki.crm.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clue")
public class ClueController {

    @Autowired
    private ClueService clueService;

    @GetMapping
    public LayResult findAll(){
        List<Clue> clueList = clueService.findAll();
        return new LayResult(0, "ok",20,clueList);
    }

    /**
     * 查询对应的线索和他相关联的市场活动
     * @return
     */
    @GetMapping("/activity/{id}")
    public LayResult findActivity(@PathVariable String id){
        Clue clue = clueService.findActivity(id);
        return new LayResult(0, "ok",20,clue);
    }


}
