package com.testdemo.demoTest;

//继承父类，继承接口
public class Employee extends People implements Acition {
    private String empid;

    private void work(){
        System.out.println("员工去工作");
    }

    //实现Emoloyee继承的接口
    @Override
    public void sport() {
        System.out.println("员工去运动");
    }

    @Override
    public void travel() {
        System.out.println("员工去旅游");

    }
}
