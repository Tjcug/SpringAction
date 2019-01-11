package com.hust.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * locate com.hust.edu.controller
 * Created by MasterTj on 2019/1/11.
 */
@Controller
public class WebController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
