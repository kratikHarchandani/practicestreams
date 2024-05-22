package com.example.streams.testpreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Tatti {
    public void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        for(int i=0;i<10;i++)
            myList.add(i);
        MyConsumer action=new MyConsumer();
myList.forEach(action);
        //action.forEach(i);
    }
    class MyConsumer implements Consumer<Integer>{
        public void accept(Integer t){
            System.out.println("Consumer imp value:" +t);
        }
    }
}
