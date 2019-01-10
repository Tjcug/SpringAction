package com.hust.edu.constructor.factory;

import com.hust.edu.pojo.People;
import com.hust.edu.pojo.PeopleA;
import com.hust.edu.pojo.PeopleB;

/**
 * locate com.hust.edu.constructor.factory
 * Created by MasterTj on 2019/1/9.
 */
public class PeopleFactory {
    public People createPeople(String type){
        switch (type){
            case "A":
                return new PeopleA();
            case "B":
                return new PeopleB();
            default:
                return null;
        }
    }
}
