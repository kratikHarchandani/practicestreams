package com.example.streams.testpreparation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer=number-> System.out.print(number+" ");
//        Consumer<Integer> consumer = null;
//        consumer = consumer.andThen(number->System.out.println(number+" "));
        List<Integer> integerList= Arrays.asList(100,200,300,400);
        printList(integerList,consumer);
    }
    public static void printList(List<Integer> integerList,
                                 Consumer<Integer> consumer){
        for(Integer integer:integerList){
            consumer.accept(integer);
        }
    }
}
