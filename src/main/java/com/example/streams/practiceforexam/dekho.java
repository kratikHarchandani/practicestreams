package com.example.streams.practiceforexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class dekho {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40);
//  working -->      int result=numbers.parallelStream().reduce(0,Integer::sum);
        int result=numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(result);
    }
}
