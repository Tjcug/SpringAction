package com.hust.edu.pojo;

import java.util.Set;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/9.
 */
public class PeopleSet {
    private int id;
    private String name;
    private Set<String> set;

    public PeopleSet(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法1 name:"+name+" id:"+id);
    }

    public PeopleSet(String name, int id) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法2 name:"+name+" id:"+id);
    }

    public PeopleSet() {
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

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "PeopleSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", set=" + set +
                '}';
    }
}
