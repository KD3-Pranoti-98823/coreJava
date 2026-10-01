package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Student {

    private int roll;
    private String name;
    private String city;
    private double marks;

    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll
                + ", name=" + name
                + ", city=" + city
                + ", marks=" + marks + "]";
    }
}

public class Program {

    public static void main(String[] args) {

        Student[] arr = {
            new Student(1, "Pranoti", "Sangli", 75),
            new Student(2, "Sakshi", "Mumbai", 85),
            new Student(3, "Neha", "Pune", 90),
            new Student(4, "Priya", "Mumbai", 85),
            new Student(5, "Raj", "Pune", 90),
            new Student(6, "Sneha", "Nashik", 80)
        };

        Comparator<Student> c = new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {

               
                int result = s2.getCity().compareTo(s1.getCity());

                if (result != 0)
                    return result;

               
                result = Double.compare(s2.getMarks(), s1.getMarks());

                if (result != 0)
                    return result;

              
                return s1.getName().compareTo(s2.getName());
            }
        };

        Arrays.sort(arr, c);

        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
