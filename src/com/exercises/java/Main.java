package com.exercises.java;

import com.exercises.java.datastructures.MyLinkedList;
import com.exercises.java.sorting.Sorting;

public class Main {

    public static void main(String[] args){

        int[] list = {3,1,7,2,9,1,9};

        StringBuilder sb = new StringBuilder("\nBefore:\n");
        for(int i: list){
            sb.append(i);
            sb.append(" ");
        }
        sb.append("\nAfter:\n");

        int[] newList = Sorting.countingSort(list);

        for(int i: newList){
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb);

        MyLinkedList<Integer> linkedList = new MyLinkedList<>(0);

        for(int i = 1; i < 11; i++){
            linkedList.push(i);
        }

        System.out.println("Adding: ");

        System.out.println(linkedList);
        System.out.println(linkedList.length());

        System.out.println("Deleting: ");

        System.out.println(linkedList.pop());
        linkedList.remove(2);
        System.out.println(linkedList);
        System.out.println(linkedList.length());


    }
}
