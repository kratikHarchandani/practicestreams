package com.example.streams.testpreparation;

public class CodeTester {
    public static void main(String[] args) {
        int rank=0;
        int count=0;
        if(5<7|rank++ < 10) rank=rank+1;
        if(!(rank>1)&&++count>1)rank=rank+100;
        System.out.println(rank+" "+count);
    }

}
