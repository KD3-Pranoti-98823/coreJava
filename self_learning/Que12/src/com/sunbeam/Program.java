package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Program {

 
    static <T> void selectionSort(T[] arr, Comparator<T> c) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (c.compare(arr[i], arr[j]) > 0) {

                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Integer[] arr = { 50, 20, 40, 10, 30 };

       
        Comparator<Integer> c = new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };

        selectionSort(arr, c);

        System.out.println("Sorted Array: "
                + Arrays.toString(arr));
    }
}