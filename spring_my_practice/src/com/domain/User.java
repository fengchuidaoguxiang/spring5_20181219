package com.domain;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private int age;

    public User() {
    }

    public User(long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
