package com.testdemo.demo5;

import java.util.List;

class Consumer implements Runnable{
    private List<String> buffer;

    public Consumer(List<String> buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        while (true){
            if(buffer.isEmpty()){
                continue;
            }
            if(buffer.get(0).equals(Main.EOF)){
                System.out.println(Thread.currentThread().getName()+"Exiting");
                break;
            }else {
                try {
                    System.out.println(Thread.currentThread().getName()+"removed"+buffer.remove(0));
                }catch(IndexOutOfBoundsException e){
//                    找出异常出现位置
//                    e.printStackTrace();
                    System.out.println("buffer已经用完");
                }
            }
        }
    }
}
