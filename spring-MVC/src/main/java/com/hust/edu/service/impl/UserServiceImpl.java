package com.hust.edu.service.impl;

import com.hust.edu.dao.UserDao;
import com.hust.edu.model.User;
import com.hust.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * locate com.hust.edu.service
 * Created by MasterTj on 2019/1/11.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.getUserList();
    }
}
