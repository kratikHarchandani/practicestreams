package com.example.streams.waitandnotify;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Object lock=new Object();
        Thread t1=new Thread(new Waiter(lock));
        Thread t2=new Thread(new Waiter(lock));
        Thread t3=new Thread(new Notifier(lock));
        t1.start();
        t2.start();
        Thread.sleep(300);
        t3.start();

    }
}
