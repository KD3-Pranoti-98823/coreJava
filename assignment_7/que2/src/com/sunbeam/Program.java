package com.sunbeam;

class InvalidDiameterException extends RuntimeException {
    public InvalidDiameterException(String message) {
        super(message);
    }
}
class Circle {
    private double myX;
    private double myY;
    private double myDiameter;
    public Circle() {
        this.myX = 0.0;
        this.myY = 0.0;
        this.myDiameter = 100.0; 
    }
    public Circle(double x, double y, double diameter) {
        if (diameter < 0) {
            throw new InvalidDiameterException("Diameter cannot be negative. Provided: " + diameter);
        }
        this.myX = x;
        this.myY = y;
        this.myDiameter = diameter;
    }
    public double getMyX() {
        return myX;
    }

    public double getMyY() {
        return myY;
    }

    public double getMyDiameter() {
        return myDiameter;
    }
    public void setMyDiameter(double diameter) {
        if (diameter < 0) {
            throw new InvalidDiameterException("Diameter cannot be negative. Provided: " + diameter);
        }
        this.myDiameter = diameter;
    }
}
public class Program {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle -> Center: (" + defaultCircle.getMyX() + ", " + defaultCircle.getMyY() + "), Diameter: " + defaultCircle.getMyDiameter());
        try {
            System.out.println("\nAttempting to create a circle with a -50 diameter");
            Circle invalidCircle = new Circle(2.5, 3.5, -50.0);
        } catch (InvalidDiameterException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
