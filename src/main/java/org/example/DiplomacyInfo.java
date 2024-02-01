package org.example;

import java.io.Serializable;

public class DiplomacyInfo implements Serializable{
    private String info;

    @Override
    public String toString() {
        return "DiplomacyInfo{" +
                "info='" + info + '\'' +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public DiplomacyInfo(String info) {
        this.info = info;
    }
}
