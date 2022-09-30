//测试类1
package com.testdemo.demo4;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student("李勇豪","男","23");
        student.eat();
        student.sleep();
        student.English();
        student.PlayCSGO();

        Student2 student2 = new Student2("李勇豪2","男","23");
        student2.eat();
        student2.sleep();

        Student3 student3 = new Student3();
        student3.English();
        student3.PlayCSGO();

    }

}
