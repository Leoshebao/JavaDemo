//person抽象类
package com.testdemo.demo4;

public  abstract class Person {
//    继承抽象类需要抽象类来继承
    String name;
    String sex;
    String age;

    abstract void eat();
    abstract void sleep();
    public Person(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

}
