package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter basket size:");
        int n = sc.nextInt();

        Fruit[] basket = new Fruit[n];
        int counter = 0;
        int choice;

        do {
            System.out.println("\n----- Fruit Basket Menu -----");
            System.out.println("0. Exit");
            System.out.println("1. Add Apple");
            System.out.println("2. Add Mango");
            System.out.println("3. Add Orange");
            System.out.println("4. Display names");
            System.out.println("5. Display fresh fruits");
            System.out.println("6. Display stale fruits");
            System.out.println("7. Mark fruit stale");
            System.out.println("8. Mark all sour fruits stale");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            // Add Apple
            if (choice == 1) {

                if (counter < basket.length) {

                    System.out.println("Name:");
                    String name = sc.next();

                    System.out.println("Weight:");
                    double weight = sc.nextDouble();

                    System.out.println("Color:");
                    String color = sc.next();

                    basket[counter] = new Apple(name, weight, color);
                    counter++;

                } else {
                    System.out.println("Basket is full.");
                }
            }

            // Add Mango
            else if (choice == 2) {

                if (counter < basket.length) {

                    System.out.println("Name:");
                    String name = sc.next();

                    System.out.println("Weight:");
                    double weight = sc.nextDouble();

                    System.out.println("Color:");
                    String color = sc.next();

                    basket[counter] = new Mango(name, weight, color);
                    counter++;

                } else {
                    System.out.println("Basket is full.");
                }
            }

            // Add Orange
            else if (choice == 3) {

                if (counter < basket.length) {

                    System.out.println("Name:");
                    String name = sc.next();

                    System.out.println("Weight:");
                    double weight = sc.nextDouble();

                    System.out.println("Color:");
                    String color = sc.next();

                    basket[counter] = new Orange(name, weight, color);
                    counter++;

                } else {
                    System.out.println("Basket is full.");
                }
            }

        } while (choice != 0);

        System.out.println("Program ended.");

        sc.close();
    }
}