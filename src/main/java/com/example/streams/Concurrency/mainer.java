package com.example.streams.Concurrency;

public class mainer {
    public static void main(String[] args) {
        System.out.println("Starting to code on threads");
        Thread t1=new Thread(new Sequencer());
        Thread t2=new Thread(new Reverser());
        t1.start();
        t2.start();
        for(int i=100;i<109;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
