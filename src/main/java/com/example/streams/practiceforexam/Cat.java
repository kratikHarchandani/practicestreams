package com.example.streams.practiceforexam;

public interface Cat {
    void CatFamily(String str);
    default void logError(String str){
        System.out.println("logging::"+str);
    }
//    void printError(String str){
//        System.out.println("Printing::"+str);
//    }

}
