package com.example.streams.Concurrency;

public class Reverser implements Runnable{
    @Override
    public void run() {
        for(int i=11;i<20;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
