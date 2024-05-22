package com.example.streams.FizzBuzz;

public class fizz implements Runnable{
    private Object lock;
    public fizz(Object lock){
        this.lock=lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            while(main.i<=main.n){
            while(!compare()){
                try {
                    lock.wait();
                    if(main.i>main.n){
                        System.exit(0);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(main.i+" fizz");
            main.i+=1;
            lock.notifyAll();
        }}
    }
    private boolean compare(){
        boolean ans=false;
        if((main.i%3==0)& (main.i %5 !=0)){
            ans=true;
        }
        return ans;
    }
}
