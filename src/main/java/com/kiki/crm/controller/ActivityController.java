package com.kiki.crm.controller;


import com.kiki.crm.domain.Activity;
import com.kiki.crm.domain.ActivityAllVO;
import com.kiki.crm.pojo.LayResult;
import com.kiki.crm.pojo.Result;
import com.kiki.crm.pojo.StatusCode;
import com.kiki.crm.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping
    public LayResult getAllActivity(){

        List<Activity> activityList = activityService.findAll();

        return new LayResult(0, "ok",20,activityList);
    }


    @PostMapping("/add")
    public Result addActivity(@RequestBody Activity activity ){
        activityService.add(activity);
        return new Result(true, StatusCode.OK);
    }

    @PostMapping("/edit")
    public Result editActivity(@RequestBody Activity activity ){
        activityService.edit(activity);
        return new Result(true, StatusCode.OK);
    }

    @GetMapping("/{id}")
    public LayResult getActivityById(@PathVariable String id){
        Activity activity = activityService.findActivityById(id);
        return new LayResult(0, "ok",20,activity);
    }

    /**
     * 查询出活动信息和备注信息
     * @param
     * @return
     */
    @GetMapping("/remark/{id}")
    public LayResult getActivityRemarkById(@PathVariable String id){
        ActivityAllVO activityAllVO = activityService.findActivityRemarkById(id);
        return new LayResult(0, "ok",20,activityAllVO);
    }

}
