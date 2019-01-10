package com.hust.edu.factory;

import com.hust.edu.pojo.People;
import com.hust.edu.pojo.PeopleA;
import com.hust.edu.pojo.PeopleB;

/**
 * locate com.hust.edu.factory
 * Created by MasterTj on 2019/1/9.
 */
public class PeopleStaticFactory {
    public static People getPeopleAInstance(){
        return new PeopleA();
    }

    public static People getPeopleBInstance(){
        return new PeopleB();
    }
}
