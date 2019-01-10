package com.hust.edu.autowired.pojo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * locate com.hust.edu.pojo
 * Created by MasterTj on 2019/1/9.
 */
@Component
@Qualifier("peopleC")
public class PeopleC extends People {
    @Override
    public String toString() {
        System.out.println("C");
        return super.toString();
    }
}
