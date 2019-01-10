package com.hust.edu.pojo;

import java.util.Properties;

/**
 * locate com.hust.edu.pojo
 * Created by MasterTj on 2019/1/10.
 */
public class PropertiesPojo {
    private Properties properties;

    public PropertiesPojo(Properties properties) {
        this.properties = properties;
    }

    public PropertiesPojo() {
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "PropertiesPojo{" +
                "properties=" + properties +
                '}';
    }
}
