package com.example.streams.testpreparation;

public class demo1 {
    public static void main(String[] args) {
        Incrementor incrementor=(number)->number+10;
        System.out.println(incrementor.incrementbyValue(10));
    }
}
