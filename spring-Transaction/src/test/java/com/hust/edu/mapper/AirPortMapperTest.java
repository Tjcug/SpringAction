package com.hust.edu.mapper;

import com.hust.edu.pojo.Airport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * locate com.hust.edu.mapper
 * Created by MasterTj on 2019/1/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AirPortMapperTest {
    @Autowired
    private AirPortMapper airPortMapper;

    @Test
    public void insertAirport() throws Exception {
        airPortMapper.insertAirport(new Airport("黄花机场","北京"));
    }

    @Test
    public void findUsers(){
        for (Airport airport : airPortMapper.selAll()) {
            System.out.println(airport);
        }
        ;
    }
}
