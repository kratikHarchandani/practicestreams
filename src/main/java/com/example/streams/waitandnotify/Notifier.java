package com.example.streams.waitandnotify;

public class Notifier implements Runnable{
    private Object lock;
    Notifier(Object lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        synchronized (lock){
            lock.notifyAll();
        }
    }
}
