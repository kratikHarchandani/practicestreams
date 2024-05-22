package com.example.streams.testpreparation;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        String array[]={"SureshKumar","Ramesh","Raj"};
//        Arrays.sort(array,new Comparator<String>(){
//            public int compare(String str1,String str2){
//                return str1.length()-str2.length();
//            }
//        });
        //Arrays.sort(array,(str1,str2)->{return (str1.length()-str2.length());});
        //Arrays.sort(array,(String str1,String str2)->{return (str1.length()-str2.length());});
        Arrays.sort(array,
                (str1,str2)->{int ret=str1.length()-str2.length();return ret;});
        Arrays.stream(array).forEach(str->System.out.println(str));

    }
}
