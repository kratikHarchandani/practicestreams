package com.example.streams.practiceforexam;

public class Numbers {
    public static void main(String[] args) {
        try{int []arr={1,2};
        arr[2]=3/0;}
        catch(Exception e){
            System.out.println("Exception");
        }
//        catch(ArithmeticException ae){
//            System.out.println("Divide by zero");
//        }
    }
}
