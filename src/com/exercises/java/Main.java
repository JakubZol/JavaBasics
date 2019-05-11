package com.exercises.java;

import com.exercises.java.sorting.Sorting;

public class Main {

    public static void main(String[] args){

        int[] list = {3,1,7,2,9};

        StringBuilder sb = new StringBuilder("Before: \n");
        for(int i: list){
            sb.append(i);
            sb.append(" ");
        }
        sb.append("\nAfter:\n");

        int[] newList = Sorting.quickSort(list);

        for(int i: newList){
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb);

    }
}
