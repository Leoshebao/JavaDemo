package com.testdemo.deno3;

public class Father extends Grandfather {
    int money=12345;
    String name;
    Father(String name,  float height, int age) {
        super();
    }
    public Father() {
        super();
    }
    public void eat() {
        System.out.println("重写父类方法：爸爸在吃饭");
    }
    public void sleep() {
        System.out.println("重写父类方法：爸爸在睡觉");
    }
    public void working() {
        System.out.println("只有爸爸在工作");
    }
    public Father(String name, float height, int age, int money) {
        super();
        this.money = money;
    }
}
