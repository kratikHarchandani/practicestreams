package com.example.streams.practice1;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new worker(1));
        Thread t2=new Thread(new worker(2));
        Thread t3=new Thread(new worker(3));
        Thread t4=new Thread(new worker(4));
        Thread t5=new Thread(new worker(5));
        t1.start();

        t2.sleep(40);
        t3.sleep(90);
        t4.sleep(110);
        t5.sleep(400);
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
