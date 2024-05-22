package com.example.streams.practiceforexam;

public class ArrayDisplay {
    public static void main(String[] args) {
        Integer[] intArray={10,20,30,40};
        Float[] floatArray={10f,20f,30f,40f};
        displayArray(intArray);
        displayArray(floatArray);
    }
    public static <T>void displayArray(T[] array){
        for(T element:array) System.out.println(element);
    }

}
