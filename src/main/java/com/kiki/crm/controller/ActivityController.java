package com.kiki.crm.controller;


import com.kiki.crm.domain.Activity;
import com.kiki.crm.pojo.Result;
import com.kiki.crm.pojo.StatusCode;
import com.kiki.crm.service.ActivityService;
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
    public Result getAllActivity(){
       List<Activity> activityList = activityService.findAll();

       return new Result(true, StatusCode.OK,"ok",activityList);
    }

    @PostMapping("/add")
    @Transient
    public Result addActivity(@RequestBody Activity activity ){
        activityService.add(activity);
        return new Result(true, StatusCode.OK);
    }

}
