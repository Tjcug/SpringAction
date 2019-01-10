package com.hust.edu.dao;

import com.hust.edu.pojo.People;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.dao
 * Created by MasterTj on 2019/1/10.
 */
public class PeopleDao {
    public List<People> findAllPeople(){
        List<People> list=new ArrayList<>();
        list.add(new People(1,"A"));
        list.add(new People(2,"B"));
        return list;
    }
}
