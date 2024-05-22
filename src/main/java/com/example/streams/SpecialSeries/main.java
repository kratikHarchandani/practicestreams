package com.example.streams.SpecialSeries;

public class main {
    public static final int n=4;
    public static int i=1;
    public static boolean isZero=true;
    public static void main(String[] args) throws InterruptedException {
        Object lock=new Object();
        Thread even=new Thread(new Even(lock));
        Thread odd=new Thread(new Odd(lock));
        Thread zero=new Thread(new Zero(lock));

        zero.start();

        even.start();
        odd.start();
    }
}
