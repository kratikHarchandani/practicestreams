package com.example.streams.testpreparation;

public class UtilityClass {
    public static boolean checkNumber(NumberChecker numCheck,int number){
        return numCheck.resolve(number);
    }
    public NumberChecker isOddNumber(){
//        return odd->(odd%2!=0);
        return odd->(odd&1)==1;
        //return (if(odd&1)==1);
    }
    public static void main(String[] args) {
        UtilityClass utility=new UtilityClass();
        NumberChecker numCheck=utility.isOddNumber();
        System.out.println(numCheck.resolve(5));
    }
}
