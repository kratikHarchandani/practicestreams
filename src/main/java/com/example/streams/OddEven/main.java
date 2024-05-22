package com.example.streams.OddEven;

import com.example.streams.practice2.Main;

public class main {
    public static volatile int currr=1;
    public static int lim=20;
    public static void main(String[] args) {
        Thread t1=new Thread(new evenworker("even"));
        Thread t2=new Thread(new oddworker("odd"));

        t2.start();
        t1.start();
    }
}
