package com.example.streams.testpreparation;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> compareString =string->{
            return string.equals("Java");
        };
        //System.out.println(compareString.negate().test("not Java"));
//System.out.println(compareString.equals("Java"));
//System.out.println(compareString.test("Java"));
        System.out.println(compareString.and(compareString).test("Java"));
    }
}
