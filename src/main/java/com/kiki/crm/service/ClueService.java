package com.kiki.crm.service;

import com.kiki.crm.dao.ClueDao;
import com.kiki.crm.domain.Clue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClueService {

    @Autowired
    private ClueDao clueDao;

    public List<Clue> findAll() {
        return clueDao.selectAll();
    }

    public Clue findActivity(String id) {
        return clueDao.findClueActivityById(id);
    }
}
