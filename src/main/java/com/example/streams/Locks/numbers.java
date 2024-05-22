package com.example.streams.Locks;

public class numbers {
    private int x;
    private Object lock;
    numbers(){
        this.x=0;
        lock=new Object();
    }

    public  void increment(){
        synchronized(lock){
        x+=1;}
    }

    public int get(){
        return this.x;
    }

}
