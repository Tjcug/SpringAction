package com.hust.edu.autowired.pojo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * locate com.hust.edu.pojo
 * Created by MasterTj on 2019/1/9.
 */
@Component
@Qualifier("peopleB")
public class PeopleB extends People {
    @Override
    public String toString() {
        System.out.println("B");
        return super.toString();
    }
}
