package com.hust.edu.controller;

import com.google.gson.Gson;
import com.hust.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * locate com.hust.edu.controller
 * Created by MasterTj on 2019/1/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Gson gson=new Gson();

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findUsers",
            produces = "application/json;charset=UTF-8")
    @ResponseBody()
    public String findUsers(){
        System.out.println(userService.findUsers());
        return gson.toJson(userService.findUsers());
    }
}
