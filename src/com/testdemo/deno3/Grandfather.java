package com.testdemo.deno3;

public class Grandfather {
    private String name;
    private int ID;
    private float height;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("爷要吃饭");
    }
    public void sleep() {
        System.out.println("爷要睡觉");
    }
    public Grandfather() {
        this.name = name;
        this.ID = ID;
        this.height = height;
        this.age = age;
    }
}
