package com.exercises.java.sorting;


import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.IntStream;


public class Sorting {

    public static void bubbleSort(int[] list){

        int length = list.length;

        if(length > 1){
            int tmp;
            int shiftCounter = 0; // if counter is 0 after inner loop iteration it means that array is sorted, outer loop breaks
            for(int x = 0; x < length; x++) {
                for (int idx = 0; idx < length - 1; idx++) {
                    if (list[idx] > list[idx + 1]) {
                        tmp = list[idx];
                        list[idx] = list[idx + 1];
                        list[idx + 1] = tmp;
                        shiftCounter += 1;
                    }
                }
                if(shiftCounter == 0){
                    System.out.println("Iterations needed: " + (x + 1));
                    break;
                }
                else{
                    shiftCounter = 0;
                }
            }
        }
    }

    public static void selectionSort(int[] list){

        int length = list.length;
        int min, tmp, idx;

        if(length > 1){
            for(int i = 0; i < length; i++){
                min = list[i];
                idx = i;
                for(int j = i; j < length; j++){
                    if(list[j] < list[i]){
                        min = list[j];
                        idx = j;
                    }
                }
                if(idx != i) {
                    tmp = list[i];
                    list[i] = min;
                    list[idx] = tmp;
                }

            }
        }
    }

    public static int[] quickSort(int[] list){

        int length = list.length;

        if(length > 1){
            Random rand = new Random();
            int idx = rand.nextInt(length);
            int pivot = list[idx];
            int[] lower = {};
            int[] upper = {};

            for(int i = 0; i < length; i++){
                if(list[i] < pivot){
                    lower  = Arrays.copyOf(lower, lower.length + 1);
                    lower[lower.length - 1] = list[i];
                }
                else{
                    upper  = Arrays.copyOf(upper, upper.length + 1);
                    upper[upper.length - 1] = list[i];
                }
            }

            lower = quickSort(lower);
            upper = quickSort(upper);

            return IntStream.concat(Arrays.stream(lower), Arrays.stream(upper)).toArray();

        }
        else{
            return list;
        }
    }

    public static int[] countingSort(int[] list){

        int length = list.length;

        if(length > 1){
            int min = list[0];
            int max = list[0];
            int[] output = new int[length];

            //finding min and max to establish range
            for(int elem : list){
                if(elem < min){
                    min = elem;
                }

                if(elem > max){
                    max = elem;
                }
            }

            //initiating histogram
            TreeMap<Integer, Integer> hist = new TreeMap<>();

            for(int i = min; i <= max; i++){
                hist.put(i, 0);
            }

            //building histogram
            for(int elem : list){
                Integer currentValue = hist.get(elem);
                hist.replace(elem, currentValue + 1);
            }

            //building output list from histogram
            int idx = 0;
            Integer counter;
            for(Integer i : hist.keySet()){
                counter = hist.get(i);
                for(int j = 0; j < counter; j++){
                    output[idx] = i;
                    idx += 1;
                }
            }


            return output;
        }
        else{
            return list;
        }

    }



}
