package com.example.streams.testpreparation;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class accountde {
    public static void main(String[] args) {
        ArrayList<Account> arr=new ArrayList<>();
        Account ar1=new Account();
        ar1.setId("23");
        arr.add(ar1);
        Account ar2=new Account();
        ar2.setId("53");
        arr.add(ar2);
        Account ar3=new Account();
        ar3.setId("3");
        arr.add(ar3);
        Account ar4=new Account();
        ar4.setId("13");
        arr.add(ar4);
        for(Account x:arr){
            System.out.print(x.getId()+" ");
        }
        System.out.println();
        Comparator<Account> compareId=Comparator.comparing(account->account.getId());
//        account->account.getId()
        Comparator <Account> compare=new Comparator<Account>(){
            public int compare(Account acc1,Account acc2){
                return acc1.getId().compareTo(acc2.getId());
            }
        };
        Collections.sort(arr,
                 compare);
        for(Account x:arr){
            System.out.print(x.getId()+" ");
        }
    }
}
