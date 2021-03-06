package com.hust.edu;

import com.hust.edu.pojo.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicatonContext.xml")
public class HelloTestTest {

    @Autowired
    private People people;
    @Test
    public void sayHello() throws Exception {
        System.out.println(people);
    }

}
