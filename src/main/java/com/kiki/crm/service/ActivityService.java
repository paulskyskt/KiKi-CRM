package com.kiki.crm.service;

import com.kiki.crm.dao.ActivityDao;
import com.kiki.crm.dao.ActivityRemarkDao;
import com.kiki.crm.domain.Activity;
import com.kiki.crm.domain.ActivityAllVO;
import com.kiki.crm.domain.ActivityRemark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityService {

    @Autowired
    private ActivityDao activityDao;

    @Autowired
    private ActivityRemarkDao activityRemarkDao;

    public List<Activity> findAll() {
       return activityDao.findAll();
    }

    public void add(Activity activity) {
        activityDao.add(activity);
    }

    public void edit(Activity activity) {
        activityDao.edit(activity);
    }

    public Activity findActivityById(String id) {
        return activityDao.findById(id);

    }

    public ActivityAllVO findActivityRemarkById(String id) {
        Activity activity = activityDao.findById(id);
        ActivityAllVO activityAllVO = new ActivityAllVO();

        List<ActivityRemark> activityRemarkList = activityDao.findRemarkById(id);

        return activityAllVO;
    }
}
