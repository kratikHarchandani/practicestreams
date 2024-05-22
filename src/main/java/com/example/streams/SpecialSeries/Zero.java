package com.example.streams.SpecialSeries;

public class Zero implements Runnable{
    private Object lock;
    public Zero(Object lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        synchronized (lock){
            while(main.i<=main.n){
                while(main.isZero==false){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(main.i>main.n)
                    System.exit(0);
                System.out.print(0+" ");
                main.isZero=false;
                lock.notifyAll();

            }
        }
    }
}
