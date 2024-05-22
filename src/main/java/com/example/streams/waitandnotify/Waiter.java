package com.example.streams.waitandnotify;

public class Waiter implements Runnable{
    private Object lock;
    public Waiter(Object lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        synchronized (lock){
            System.out.println("Hello from waiter");
            try {
                this.lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Bye from waiter");
        }
    }
}
