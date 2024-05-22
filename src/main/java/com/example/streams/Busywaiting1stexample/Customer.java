package com.example.streams.Busywaiting1stexample;

public class Customer implements Runnable{
    private final int appointment_id;
    private final TickingBoard tickingBoard;
    public Customer(int appointment_id,TickingBoard tickingBoard){
        this.appointment_id=appointment_id;
        this.tickingBoard=tickingBoard;
    }
    @Override
    public void run() {
        synchronized (tickingBoard){
        while(!tickingBoard.isMyTurn(appointment_id)){
            System.out.println(appointment_id+" denied entry");
            try {
                tickingBoard.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }
        synchronized (tickingBoard){
        System.out.println(appointment_id+" granted entry");
        tickingBoard.notifyAll();}

    }
}
