package com.kiki.crm.service;

import com.kiki.crm.dao.UserDao;
import com.kiki.crm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.selectAll();

    }



}
