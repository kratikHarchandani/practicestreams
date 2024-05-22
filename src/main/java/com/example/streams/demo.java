package com.example.streams;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,9,13,4,6,2,4,12,15);

        BinaryOperator<Integer> binary= new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
        int sum= numbers.stream().reduce(0,binary);
        System.out.println(sum);
        System.out.println("***********************");
        Function<Integer,Integer> func=x->x*x;

        printer(numbers,func);

    }
    public static void printer(List<Integer> numbers,Function<Integer,Integer> func){
        List<Integer> ans=numbers.stream().map(func).collect(Collectors.toList());
        for(int i:ans)
            System.out.println(i);
    }
}
