package com.example.streams.practiceforexam;

@FunctionalInterface
public interface interfaceApp {
//    default double square(int a){
//        return a*a;
//    }
    void show1(int a);
    default void show(int a){
        //square(a);
    }
    //void show(int a);

}
