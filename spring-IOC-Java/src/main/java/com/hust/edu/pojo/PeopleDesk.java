package com.hust.edu.pojo;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/9.
 */
public class PeopleDesk {
    private int id;
    private String name;

    private Desk desk;

    public PeopleDesk(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法1 name:"+name+" id:"+id);
    }

    public PeopleDesk(String name, int id) {
        this.id = id;
        this.name = name;
        System.out.println("有参数构造方法2 name:"+name+" id:"+id);
    }

    public PeopleDesk() {
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

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    @Override
    public String toString() {
        return "PeopleDesk{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desk=" + desk +
                '}';
    }
}
