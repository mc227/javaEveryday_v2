package org.example;

import java.io.Serializable;

public class ResourceInfo implements Serializable{
    private String info;

    @Override
    public String toString() {
        return "ResourceInfo{" +
                "info='" + info + '\'' +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ResourceInfo(String info) {
        this.info = info;
    }
}
