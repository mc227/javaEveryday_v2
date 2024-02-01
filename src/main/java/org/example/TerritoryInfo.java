package org.example;

import java.io.Serializable;

public class TerritoryInfo{
    private String info;

    public TerritoryInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "TerritoryInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}
