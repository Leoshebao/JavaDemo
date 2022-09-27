package com.testdemo.deno2;

public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.setName("小明");
        System.out.println("名字："+son.getName());
        son.playgame();
        son.printSonMoney();
        System.out.println("===================================================");
        Father father = new Father();
        father.setName("小明爸爸");
        father.name = "小明后爸";
        System.out.println("get()名字："+father.getName());
        System.out.println("直接赋值名字："+father.name);
        father.working();
        father.eat();
        father.sleep();
    }
}
