package com.sunbeam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return id + "  " + name + "  " + price + "  " + quantity;
    }
}

class ShoppingCart {

   
    private HashMap<Integer, Product> cart = new HashMap<>();

   
    private ArrayList<String> orderHistory = new ArrayList<>();


    public void addProduct(Product product) {

        if (cart.containsKey(product.getId())) {

            Product existing = cart.get(product.getId());

            existing.setQuantity(
                    existing.getQuantity() + product.getQuantity()
            );

        } else {
            cart.put(product.getId(), product);
        }

        System.out.println("Product added to cart.");
    }


    public void displayCart() {

        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = 0;

        System.out.println("\n----- Shopping Cart -----");

        for (Product p : cart.values()) {

            System.out.println(p);

            total = total + p.getTotal();
        }

        System.out.println("Total Amount: " + total);
    }

   
    public void removeProduct(int id) {

        if (cart.containsKey(id)) {

            cart.remove(id);

            System.out.println("Product removed.");

        } else {
            System.out.println("Product not found.");
        }
    }


    public void placeOrder() {

        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = 0;

        for (Product p : cart.values()) {
            total = total + p.getTotal();
        }

        String order = "Order Amount: " + total;

        orderHistory.add(order);

        cart.clear();

        System.out.println("Order placed successfully.");
        System.out.println("Amount: " + total);
    }

   
    public void displayOrderHistory() {

        if (orderHistory.isEmpty()) {
            System.out.println("No previous orders.");
            return;
        }

        System.out.println("\n----- Order History -----");

        for (String order : orderHistory) {
            System.out.println(order);
        }
    }
}

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        int choice;

        do {

            System.out.println("\n===== SHOPPING CART =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Cart");
            System.out.println("3. Remove Product");
            System.out.println("4. Place Order");
            System.out.println("5. Display Order History");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter product ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter product name: ");
                String name = sc.nextLine();

                System.out.print("Enter price: ");
                double price = sc.nextDouble();

                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                Product p = new Product(id, name, price, quantity);

                cart.addProduct(p);

                break;

            case 2:

                cart.displayCart();

                break;

            case 3:

                System.out.print("Enter product ID to remove: ");
                int removeId = sc.nextInt();

                cart.removeProduct(removeId);

                break;

            case 4:

                cart.placeOrder();

                break;

            case 5:

                cart.displayOrderHistory();

                break;

            case 0:

                System.out.println("Thank you!");

                break;

            default:

                System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
