package com.hust.edu.pojo;

/**
 * locate com.hust.edu.pojo
 * Created by MasterTj on 2019/1/10.
 */
public class Desk {
    private String name;
    private int price;

    public Desk(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Desk() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "name='" + name + '\'' +
                '}';
    }
}
