package com.hust.edu.autowired.pojo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * locate com.hust.edu.pojo
 * Created by MasterTj on 2019/1/9.
 */
@Component
@Primary
@Qualifier("peopleA")
public class PeopleA extends People {
    @Override
    public String toString() {
        System.out.println("A");
        return super.toString();
    }
}
