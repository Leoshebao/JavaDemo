package com.testdemo.demo5;

public class ThreadTest {
    public static void main(String[] args) {
//        使用Mythread创建线程，用此承载main()的执行
        Mythread mythread = new Mythread();
//        开始线程调用Tread的run()
        mythread.start();
        while (true){
            System.out.println("main()正在运行");
        }
    }
}

class Mythread extends Thread{
//重写Tread的方法
    @Override
    public void run() {
        while (true){
            System.out.println("Mythread正在运行！");
        }
    }
}