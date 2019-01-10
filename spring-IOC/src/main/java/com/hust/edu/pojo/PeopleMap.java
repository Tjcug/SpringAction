package com.hust.edu.pojo;

import java.util.Map;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/9.
 */
public class PeopleMap {
    private int id;
    private String name;
    private Map<String,String> map;

    public PeopleMap(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法1 name:"+name+" id:"+id);
    }

    public PeopleMap(String name, int id) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法2 name:"+name+" id:"+id);
    }

    public PeopleMap() {
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

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "PeopleMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", map=" + map +
                '}';
    }
}
