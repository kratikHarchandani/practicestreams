package com.example.streams.practice1;

public class worker implements Runnable{
    private int val;
    worker(int value){
        this.val=value;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" "+val);
    }
}
