package com.example.streams.ConcurrentSum;

import com.sun.tools.javac.Main;

import java.util.List;

public class worker implements Runnable{
    private List<Integer> arr;
    private final int left;
    private final int right;
    worker(List<Integer> arr,int left,int right){
     this.arr=arr;
     this.left=left;
     this.right=right;
    }
    @Override
    public void run() {
        long so=0;
        for(int i=left;i<=right;i++){
            so+=arr.get(i);
        }
        //System.out.println(Thread.currentThread().getName()+" "+so);
        maint.sum.addAndGet(so);
        //System.out.println("Aggregate Value:"+maint.sum.get());
    }
}
