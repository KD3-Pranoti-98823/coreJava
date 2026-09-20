
package gemoetry.com;
import java.util.Scanner;


public class TestPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter x and y coordinates of first point: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

   
        System.out.print("Enter x and y coordinates of second point: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

       
        Point2d p1 = new Point2d(x1, y1);
        Point2d p2 = new Point2d(x2, y2);

        
        System.out.println("First Point: " + p1.getDetails());
        System.out.println("Second Point: " + p2.getDetails());

       
        if (p1.isEqual(p2)) {
            System.out.println("Both points are at the same position.");
        } else {
            System.out.println("Points are different.");

          
            double distance = p1.calculateDistance(p2);
            System.out.println("Distance between points: " + distance);
        }

        sc.close();
    }
}
