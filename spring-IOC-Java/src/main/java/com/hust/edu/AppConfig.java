package com.hust.edu;

import com.hust.edu.dao.PeopleDao;
import com.hust.edu.service.PeopleService;
import com.hust.edu.service.impl.PeopleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 */
@Configuration
@ComponentScan
@ImportResource("classpath:applicatonContext.xml")
public class AppConfig {

    @Bean(name = "peopleService")
    public PeopleService peopleService(PeopleDao peopleDao){
        return new PeopleServiceImpl(peopleDao);
    }

    @Bean(name = "peopleDao")
    public PeopleDao peopleDao(){
        return new PeopleDao();
    }
}
