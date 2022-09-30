//Teacher类
package com.testdemo.demo4;

public  class Teacher extends Person implements Action{
    public Teacher(String name, String sex, String age) {
        super(name, sex, age);
    }


    public void eat(){
        System.out.println(this.name+"老师在吃饭");
    }
    public void sleep(){
        System.out.println(this.name+"老师在睡觉");
    }
    public void English(){
        System.out.println(this.name+"老师在学英语");
    }
    @Override
    public void PlayCSGO() {
        System.out.println(this.name+"老师在打CSGO");
    }
}
