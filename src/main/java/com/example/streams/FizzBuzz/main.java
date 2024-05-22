package com.example.streams.FizzBuzz;

public class main {
    public static final int n=15;
    public static int i=1;

    public static void main(String[] args) {
        Object lock=new Object();
        Thread fizz=new Thread(new fizz(lock));
        Thread fizzbuzz=new Thread(new fizzbuzz(lock));
        Thread buzz=new Thread(new buzz(lock));
        Thread plain=new Thread(new plain(lock));

        fizz.start();
        fizzbuzz.start();
        plain.start();
        buzz.start();
    }
}
