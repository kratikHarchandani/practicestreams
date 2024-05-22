package com.example.streams.ProdConsumer;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        MyQueue que=new MyQueue(50);
        Thread producer=new Thread(new Producer(que));
        Thread consumer=new Thread(new Consumer(que));
        producer.start();
        consumer.start();

    }
}
