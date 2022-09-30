//Student类
package com.testdemo.demo4;

public class Student extends Person implements Action{
    public Student(String name, String sex, String age) {
        super(name, sex, age);
    }
//    一个类实现了一个接口，必须实现接口内的所有方法；
    public void eat(){
        System.out.println(this.name+":学生在吃饭");
    }
    public void sleep(){
        System.out.println(this.name+":学生在睡觉");
    }
    public void PlayCSGO(){
        System.out.println(this.name+":学生在打CSGO");
    }
    public void English(){
        System.out.println(this.name+":学生在学英语");
    }
}
