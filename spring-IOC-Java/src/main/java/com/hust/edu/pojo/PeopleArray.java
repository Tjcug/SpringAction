package com.hust.edu.pojo;

import java.util.Arrays;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/9.
 */
public class PeopleArray {
    private int id;
    private String name;
    private String[] strings;

    public PeopleArray(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法1 name:"+name+" id:"+id);
    }

    public PeopleArray(String name, int id) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法2 name:"+name+" id:"+id);
    }

    public PeopleArray() {
        System.out.println("执行默认的构造方法");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setter id: "+ id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setter name: "+ name);
        this.name = name;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "PeopleArray{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", strings=" + Arrays.toString(strings) +
                '}';
    }
}
