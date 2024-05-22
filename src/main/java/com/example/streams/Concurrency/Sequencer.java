package com.example.streams.Concurrency;

public class Sequencer implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
