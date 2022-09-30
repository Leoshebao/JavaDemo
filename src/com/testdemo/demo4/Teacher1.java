//Teacher1类
package com.testdemo.demo4;

public class Teacher1 extends Person implements Study{
    public Teacher1(String name, String sex, String age) {
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

    @Override
    public void English() {
        System.out.println(this.name+":老师在学英语");

    }
}
