//Student2类
package com.testdemo.demo4;

public class Student2 extends Person {

    public Student2(String name, String sex, String age) {
        super(name, sex, age);
    }

    public void eat(){
        System.out.println(this.name+"学生在吃饭");
    }
    public void sleep(){
        System.out.println(this.name+"学生在睡觉");
    }
}
