//Teacher2类
package com.testdemo.demo4;

public class Teacher2 extends Person{
    public Teacher2(String name, String sex, String age) {
        super(name, sex, age);
    }

    @Override
    void eat() {
        System.out.println(this.name+":老师在吃饭");
    }

    @Override
    void sleep() {
        System.out.println(this.name+":老师在睡觉");
    }
}
