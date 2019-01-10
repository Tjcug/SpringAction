package com.hust.edu.pojo;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/9.
 */
public class People {
    private int id;
    private String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法1 name:"+name+" id:"+id);
    }

    public People(String name, int id) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法2 name:"+name+" id:"+id);
    }

    public People() {
        System.out.println("执行默认的构造方法");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
