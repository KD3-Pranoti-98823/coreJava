package com.sunbeam;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = IntStream.rangeClosed(1, n)
                                  .asLongStream()
                                  .reduce(1, (a, b) -> a * b);

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}
