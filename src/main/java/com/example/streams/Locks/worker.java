package com.example.streams.Locks;

public class worker implements  Runnable{
    private numbers apna;
    worker(numbers apna){
        this.apna=apna;
    }
    public void run(){
        for(int i=0;i<10000;i++){
            apna.increment();
        }
    }
}
