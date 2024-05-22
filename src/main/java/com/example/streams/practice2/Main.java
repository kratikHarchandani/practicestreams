package com.example.streams.practice2;

public class Main {
    public static int curr=0;
    public static int rounds =2;
    public static int lim;
    public static int currr;

    public static void main(String[] args) {

        Object lock=new Object();
        Thread t1=new Thread(new worker(1,lock));
        Thread t2=new Thread(new worker(2,lock));
        Thread t3=new Thread(new worker(3,lock));
        Thread t4=new Thread(new worker(4,lock));
        Thread t5=new Thread(new worker(5,lock));
        Thread t6=new Thread(new worker(6,lock));
        Thread t7=new Thread(new worker(7,lock));
        Thread t8=new Thread(new worker(8,lock));
        Thread t9=new Thread(new worker(9,lock));
        Thread t10=new Thread(new worker(0,lock));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }
}
