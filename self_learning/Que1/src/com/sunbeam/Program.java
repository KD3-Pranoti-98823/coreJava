package com.sunbeam;


class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return city;
    }
}

class Student {
    int rollNo;
    String name;
    Address address;

   
    public Student() {
        rollNo = 0;
        name = "Unknown";
        address = new Address("Unknown");
    }

 
    public Student(int rollNo, String name, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

   
    public Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.address = s.address;      
    }

  
    public Student(Student s, boolean deepCopy) {
        this.rollNo = s.rollNo;
        this.name = s.name;

        if (deepCopy) {
            this.address = new Address(s.address.city); 
        } else {
            this.address = s.address;
        }
    }

    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("City    : " + address.city);
        System.out.println();
    }
}

public class Program {
    public static void main(String[] args) {

        Address a1 = new Address("Pune");

        Student s1 = new Student(1, "Pranoti", a1);

     
        Student s2 = new Student(s1);

     
        Student s3 = new Student(s1, true);

        System.out.println("Original Student:");
        s1.display();

        System.out.println("Shallow Copy:");
        s2.display();

        System.out.println("Deep Copy:");
        s3.display();

      
        s1.address.city = "Sangli";

        System.out.println("After changing original address:");

        System.out.println("Original Student:");
        s1.display();

        System.out.println("Shallow Copy:");
        s2.display();

        System.out.println("Deep Copy:");
        s3.display();
    }
}