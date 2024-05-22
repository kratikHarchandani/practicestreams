package com.example.streams.Locks;

public class main {
    public static void main(String[] args) throws InterruptedException {
        numbers apna=new numbers();
        Thread t1=new Thread(new worker(apna));
        Thread t2=new Thread(new worker(apna));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(apna.get());
    }
}
