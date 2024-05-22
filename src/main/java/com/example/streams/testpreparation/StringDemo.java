package com.example.streams.testpreparation;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {
    public static void main(String[] args) {
        List<String> empNames=new ArrayList<>();
        empNames.add("Rajan");
        empNames.add("Kumar");
        empNames.add("Ramesh");
empNames.add("Harish");
        int count=0;
        for(String str:empNames){
            if(str.substring(0,1).equals("R"))
                count++;
        }
        //long count=empNames.stream().filter(str->str.startsWith("R")).count();
        //long count=empNames.stream().filter(empNames->startsWith("R")).count();
        System.out.println("There are "+count+"names that starts with R");
    }
}
