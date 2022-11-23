package com.testdemo.demo5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String EOF = "EOF";
    public static void main(String[] args){
        List<String> buffer = new ArrayList<>();

        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.setName("producerThread");

        Thread consumerThread = new Thread(new Consumer(buffer));
        consumerThread.setName("consumerThread");

        Thread consumerThread1 = new Thread(new Consumer(buffer));
        consumerThread1.setName("consumerThread1");


        producerThread.start();
        consumerThread.start();
        consumerThread1.start();




    }


}
