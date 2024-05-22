package com.example.streams.ConcurrentSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class maint {
    public static AtomicLong sum = new AtomicLong(0);

    public static void main(String[] args)throws InterruptedException {
        List<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arr.add(random.nextInt());
        }
        long l = System.currentTimeMillis();
        long computed = 0;
        for (int num : arr) {
            computed += num;
        }
        System.out.println("Total:"+computed);
        System.out.println(System.currentTimeMillis() - l);

        Thread t1 = new Thread(new worker(arr, 0, 249));
        Thread t2 = new Thread(new worker(arr, 250, 499));
        Thread t3 = new Thread(new worker(arr, 500, 749));
        Thread t4 = new Thread(new worker(arr, 750, 999));

        long ti = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("multithread:"+sum.get());
        System.out.println(System.currentTimeMillis() - ti);

    }
}
