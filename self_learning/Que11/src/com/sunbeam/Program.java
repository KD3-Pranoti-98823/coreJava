package com.sunbeam;

public class Program {

    public static <T extends Number> T findMin(T[] arr) {

        T min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].doubleValue() < min.doubleValue()) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Integer[] arr1 = { 50, 20, 80, 10, 40 };

        Double[] arr2 = { 5.5, 2.2, 8.8, 1.1, 4.4 };

        System.out.println("Minimum Integer = " + findMin(arr1));

        System.out.println("Minimum Double = " + findMin(arr2));
    }
}