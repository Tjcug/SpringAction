package com.hust.edu.service.impl;

import com.hust.edu.dao.PeopleDao;
import com.hust.edu.pojo.People;
import com.hust.edu.service.PeopleService;

import java.util.List;

/**
 * locate com.hust.edu.service
 * Created by MasterTj on 2019/1/10.
 */
public class PeopleServiceImpl implements PeopleService {

    private PeopleDao peopleDao;

    public PeopleServiceImpl(PeopleDao peopleDao) {
        this.peopleDao = peopleDao;
    }

    @Override
    public List<People> findAllPeople() {
        return peopleDao.findAllPeople();
    }
}
