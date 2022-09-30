package com.testdemo.deno3;

public class Son extends Father {
    int money;
    public Son() {
        super();
    }
    public void playgame() {
        System.out.println("只有儿子在打游戏");
    }
    public void printSonMoney() {
        System.out.println("儿子的父亲有"+super.money);
    }
    public Son(String name, float height, int age, int money) {
        super(name, height, age);
        this.money = money;
    }
}
