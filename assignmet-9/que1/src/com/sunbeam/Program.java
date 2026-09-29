package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo +
               ", Name: " + name +
               ", Marks: " + marks;
    }
}

public class Program {

    static Scanner sc = new Scanner(System.in);

    // List interface + ArrayList object
    static List<Student> students = new ArrayList<>();

    public static void addStudent() {

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(rollNo, name, marks);

        students.add(s);

        System.out.println("Student added successfully.");
    }

    public static void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            Student s = itr.next();
            System.out.println(s);
        }
    }

    public static void searchStudent() {

        System.out.print("Enter Roll No to search: ");
        int rollNo = sc.nextInt();

        boolean found = false;

        for (Student s : students) {

            if (s.getRollNo() == rollNo) {
                System.out.println("Student found:");
                System.out.println(s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void sortByRollNo() {

        students.sort((s1, s2) ->
                Integer.compare(s1.getRollNo(), s2.getRollNo()));

        System.out.println("Students sorted by Roll No.");
    }

    public static void sortByName() {

        students.sort((s1, s2) ->
                s1.getName().compareTo(s2.getName()));

        System.out.println("Students sorted by Name.");
    }

    public static void sortByMarks() {

        students.sort((s1, s2) ->
                Double.compare(s1.getMarks(), s2.getMarks()));

        System.out.println("Students sorted by Marks.");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Marks");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                addStudent();
                break;

            case 2:
                displayStudents();
                break;

            case 3:
                searchStudent();
                break;

            case 4:
                sortByRollNo();
                break;

            case 5:
                sortByName();
                break;

            case 6:
                sortByMarks();
                break;

            case 0:
                System.out.println("Program exited.");
                break;

            default:
                System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }
}