package com.testdemo.demo;

public class DemoMain {
    public static void main(String[] args) {
//        构造人类对象
        People people = new People();
        people.age = "23";
        people.name = "广科周柏豪";
        people.sex = "男";

        people.eat();
        people.speak();
//        构造学生类对象
        Student student = new Student();
        student.age = 21;
        student.gender = "女";
        student.name = "我对象";

        student.showinfo();


    }
}
