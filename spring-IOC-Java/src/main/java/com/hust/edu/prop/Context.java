package com.hust.edu.prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * locate com.hust.edu.prop
 * Created by MasterTj on 2019/1/10.
 */
@Component
public class Context {

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    public Context(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Context() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Context{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
