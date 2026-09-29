package com.sunbeam;

import java.util.Scanner;
class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong() {
        super("The string is too long");
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();
        try {
            if (userInput.length() > 80) {
                throw new ExceptionLineTooLong();
            }
            System.out.println("string length is: " + userInput.length());
        } catch (ExceptionLineTooLong e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}