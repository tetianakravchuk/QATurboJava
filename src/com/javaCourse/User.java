package com.javaCourse;

public class User {
    long id;
    String name;
    String email;


    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;

    }

    public void printInfo() {
        System.out.println(id + "" + name + "" + email + "");
    }

    public void jump() {
        System.out.println((name + "jumping"));
    }
}
