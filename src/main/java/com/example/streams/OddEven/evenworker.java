package com.example.streams.OddEven;

import com.example.streams.practice2.Main;

public class evenworker implements Runnable{
    private String name;
    private Object lock=new Object();
    evenworker(String name){
        this.name=name;
    }
    public void run(){

        while(Main.currr<=Main.lim){
            while(compare()){};

            synchronized (lock){
                System.out.println(name+" "+Main.currr);
                Main.currr+=1;
            }
        }
    }
    private boolean compare(){
        boolean ans=false;
        synchronized (lock){
            ans=(Main.currr%2!=0);
        }
        return ans;
    }
}
