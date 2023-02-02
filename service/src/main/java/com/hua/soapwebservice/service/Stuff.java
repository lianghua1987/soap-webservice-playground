package com.hua.soapwebservice.service;

import java.io.Serializable;

public class Stuff implements Serializable {
    public String name;
    public String description;

    public Stuff(){}
    public Stuff(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}