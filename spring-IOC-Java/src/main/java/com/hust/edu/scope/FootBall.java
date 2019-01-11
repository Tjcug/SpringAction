package com.hust.edu.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * locate com.hust.edu.scope
 * Created by MasterTj on 2019/1/11.
 */
@Component
@Scope(value = "prototype")
public class FootBall {
    private String name;

    public FootBall(String name) {
        this.name = name;
    }

    public FootBall() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FootBall{" +
                "name='" + name + '\'' +
                '}';
    }
}
