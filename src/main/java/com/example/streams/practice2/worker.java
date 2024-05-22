package com.example.streams.practice2;

public class worker implements Runnable{
    private int val;
    private Object lock;
    //private int rounds;
    int count=0;
    worker(int val,Object lock){
        this.val=val;
        this.lock=lock;
        //this.rounds=rounds;
    }
    public void run(){

            synchronized (lock) {
                while (!compare()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println(val);
           synchronized (lock){
               Main.curr++;
               lock.notifyAll();
           }

    }
    private boolean compare(){
        boolean ans=false;
        //synchronized (lock){
            ans=(val==Main.curr);
        //}
        return ans;
    }
}
