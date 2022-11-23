package com.testdemo.demo5;

public class RunnablaeTest {
    public static void main(String[] args) {
//        使用Runnable接口需要由一个Thread对象来转载来执行
        MyRunnable myRunnable = new MyRunnable();
//        相当于重写了Thread的run()
        Thread thread = new Thread(myRunnable);
        thread.start();


        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread thread2 = new Thread(myRunnable2);
        thread2.start();

//主线程
        while (true){
            System.out.println("Main方法使用");
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("MyRunnable正在执行！");
        }
    }
}


class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("11111111111MyRunnable2正在执行！");
        }
    }
}


