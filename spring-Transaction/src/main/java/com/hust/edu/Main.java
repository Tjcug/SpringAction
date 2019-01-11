package com.hust.edu;

import com.hust.edu.mapper.AirPortMapper;
import com.hust.edu.pojo.Airport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AirPortMapper airPortMapper = applicationContext.getBean("airPortMapper", AirPortMapper.class);
        airPortMapper.insertAirport(new Airport("黄花机场","北京"));
    }
}
