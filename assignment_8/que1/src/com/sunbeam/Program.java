package com.sunbeam;

import java.util.Scanner;
import java.util.Arrays;
class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Salary: " + salary;
    }
}
interface Stack {
    int STACK_SIZE = 5; 
    void push(Employee e);
    Employee pop();
}
class FixedStack implements Stack {
    private Employee[] arr = new Employee[STACK_SIZE];
    private int top = -1;
    @Override
    public void push(Employee e) {
        if (top == STACK_SIZE - 1) {
            System.out.println("Stack Overflow! Cannot add more employees.");
        } else {
            arr[++top] = e;
            System.out.println("Employee added successfully.");
        }
    }

    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return null;
        } else {
            return arr[top--];
        }
    }
}
class GrowableStack implements Stack {
    private Employee[] arr = new Employee[STACK_SIZE];
    private int top = -1;
    @Override
    public void push(Employee e) {
        if (top == arr.length - 1) {
            System.out.println("Stack full. Growing stack size");
            Employee[] newArr = new Employee[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[++top] = e;
        System.out.println("Employee added successfully.");
    }
    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return null;
        } else {
            return arr[top--];
        }
    }
}
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack myStack = null; 
        boolean stackSelected = false;
        while (true) {
            System.out.println("MENU ");
            System.out.println("1 Choose Fixed Stack");
            System.out.println("2 Choose Growable Stack");
            System.out.println("3 Push data");
            System.out.println("4 Pop data & display");
            System.out.println("5 Exit");
            System.out.print("Enter choice: ");
           
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (!stackSelected) {
                        myStack = new FixedStack();
                        stackSelected = true;
                        System.out.println("Fixed Stack selected.");
                    } else {
                        System.out.println("Stack is already selected");
                    }
                    break;
                case 2:
                    if (!stackSelected) {
                        myStack = new GrowableStack();
                        stackSelected = true;
                        System.out.println("Growable Stack selected.");
                    } else {
                        System.out.println("Stack is already selected");
                    }
                    break;
                case 3:
                    if (myStack == null) {
                        System.out.println("NO stack chosen");
                    } else {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();
                        myStack.push(new Employee(id, name, salary));
                    }
                    break;
                case 4:
                    if (myStack == null) {
                        System.out.println("NO stack chosen");
                    } else {
                        Employee popped = myStack.pop();
                        if (popped != null) {
                            System.out.println("Popped Employee: " + popped);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option! Please try again.");
            }
        }
    }
}