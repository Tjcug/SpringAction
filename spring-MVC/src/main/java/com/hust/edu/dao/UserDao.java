package com.hust.edu.dao;

import com.hust.edu.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.hust.edu.dao
 * Created by MasterTj on 2019/1/11.
 */
@Repository
public class UserDao {
    public List<User> getUserList(){
        List<User> list=new ArrayList<>();
        list.add(new User(1,"tanjie"));
        list.add(new User(2,"zhangsan"));
        list.add(new User(3,"lisi"));
        return list;
    }
}
