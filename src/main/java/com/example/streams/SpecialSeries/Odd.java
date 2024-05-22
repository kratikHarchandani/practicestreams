package com.example.streams.SpecialSeries;

public class Odd implements Runnable{
    private Object lock;
     public Odd(Object lock){
         this.lock=lock;
     }
    @Override
    public void run() {
       synchronized (lock){
           while(main.i<=main.n){
               while(main.isZero==true||main.i%2==0){
                   try {
                       lock.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
               if(main.i>main.n)
                   System.exit(0);
               System.out.print(main.i+" ");
               main.i+=1;
               main.isZero=true;
               lock.notifyAll();

           }
       }
    }
}
