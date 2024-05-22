package com.example.streams.practiceforexam;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        BigDecimal num=new BigDecimal("1");
        Scanner x=new Scanner(System.in);
        int i=2;
        int n=x.nextInt();
        while(i<=n){
            num=num.multiply(BigDecimal.valueOf(i));
            i++;
        }
        System.out.println(num);
    }


}
