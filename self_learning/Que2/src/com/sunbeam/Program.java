package com.sunbeam;

abstract class Shape {
    abstract void area();
}

abstract class Shape2D extends Shape {
 
}

abstract class Shape3D extends Shape {
    abstract void volume();
}


class Circle extends Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle = " + (Math.PI * radius * radius));
    }
}


class Rectangle extends Shape2D {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}


class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Surface Area of Sphere = "
                + (4 * Math.PI * radius * radius));
    }

    @Override
    void volume() {
        System.out.println("Volume of Sphere = "
                + ((4.0 / 3) * Math.PI * radius * radius * radius));
    }
}


class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Surface Area of Cube = " + (6 * side * side));
    }

    @Override
    void volume() {
        System.out.println("Volume of Cube = " + (side * side * side));
    }
}

public class Program {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 5);
        Sphere s = new Sphere(5);
        Cube cube = new Cube(4);

        c.area();

        r.area();

        s.area();
        s.volume();

        cube.area();
        cube.volume();
    }
}
