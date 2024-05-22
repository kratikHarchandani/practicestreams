package com.example.streams.Busywaiting1stexample;

import java.util.List;

public class TickingBoard {
    private final List<Integer> appointments;
    private int curr;
    public TickingBoard(List<Integer> appointments){
        this.appointments=appointments;
        this.curr=0;
    }
    public synchronized boolean isMyTurn (int appointment_id){
        if(curr==appointments.size()){
            throw new RuntimeException("No more appointments");
        }
        if(appointments.get(curr)!=appointment_id){
            return false;
        }
        curr++;
        return true;
    }

}
