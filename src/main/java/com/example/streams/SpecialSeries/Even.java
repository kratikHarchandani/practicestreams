package com.example.streams.SpecialSeries;

public class Even implements Runnable{
    private Object lock;
    public Even(Object lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        synchronized (lock){
            while(main.i<=main.n){
                while(main.isZero==true||main.i%2!=0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(main.i+" ");
                main.i+=1;
                main.isZero=true;
                lock.notifyAll();

            }
        }

    }
}
