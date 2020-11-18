package com.javaCourse.oop.inheritance_and_polymorphism.animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    protected Animal() {
    }


    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public abstract void voice();

    public void jump() {
        System.out.println(name + " jump up");
    }
}
