package com.example.streams.testpreparation;

public class CodeTesterr {
    public static void changeContent(int []numbergame){
        numbergame[0]=2;
        numbergame[1]=6;
    }
    public static void changeReference(int []numbergame){
        numbergame=new int[2];
        numbergame[0]=15;
        numbergame[1]=11;
    }
    public static void main(String[] args) {
        int[] numbergame=new int[2];
        numbergame[0]=4;
        numbergame[1]=7;
        changeContent(numbergame);
        System.out.println(numbergame[0]+" "+numbergame[1]);
        changeReference(numbergame);
        System.out.println(numbergame[0]+" "+numbergame[1]);

    }
}
