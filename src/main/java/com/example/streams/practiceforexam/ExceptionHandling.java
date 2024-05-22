package com.example.streams.practiceforexam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 4, 6, 0, 10, 20);
//        integers.forEach(i->{
//            try{
//                System.out.println(100/i);
//            }
//            catch(ArithmeticException e){
//                System.out.println("Exception"+e.getMessage());
//            }
//        }

      //  );
//        try{
//            for(Integer i:integers){
//                System.out.println(100/i);
//            }
//        }
//        catch(ArithmeticException e){
//           System.out.println("Exception"+e.getMessage());
//        }
        try{
            integers.forEach(i->{
                System.out.println(100/i);
            });}
        catch(ArithmeticException e){
            System.out.println("Exception"+e.getMessage());

        }
        //integers.forEach(ExceptionWrapper(i -> System.out.println(100 / i)));
    }
        static Consumer<Integer> ExceptionWrapper (Consumer < Integer > consumer) {
            return i -> {
                try {
                    consumer.accept(i);
                } catch (ArithmeticException e) {
                    System.out.println(
                            "Exception:" + e.getMessage());
                }
            };
        }
}
