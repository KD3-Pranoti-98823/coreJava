package com.sunbeam;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        int sum = IntStream.rangeClosed(1, n)
                           .sum();

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
