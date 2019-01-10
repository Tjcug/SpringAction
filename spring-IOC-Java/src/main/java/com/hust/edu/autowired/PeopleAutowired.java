package com.hust.edu.autowired;

import com.hust.edu.autowired.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * locate com.hust.edu.autowired
 * Created by MasterTj on 2019/1/10.
 */
@Component
public class PeopleAutowired {

    @Autowired
    @Qualifier("peopleB")
    private People people;

    @Override
    public String toString() {
        return "PeopleAutowired{" +
                "people=" + people +
                '}';
    }
}
