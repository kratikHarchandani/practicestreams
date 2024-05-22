package com.example.streams.testpreparation;

import java.util.ArrayList;

public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.forEach(index->{
            if(index%2!=0)
                System.out.println(arrayList.get(index));
        });
    }
}
