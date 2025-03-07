/*
   Name: Amitkumar Racha
   PRN:  24070126501
   Batch: A1 (2023-27)
*/

import shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose a shape to calculate Area, Perimeter, and Volume (if applicable):");
            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Equilateral Pyramid\n7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Shape shape = null;
            Volume volume = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter Radius: ");
                    double r = sc.nextDouble();
                    shape = new Circle(r);
                    break;
                case 2:
                    System.out.print("Enter Length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter Width: ");
                    double w = sc.nextDouble();
                    shape = new Rectangle(l, w);
                    break;
                case 3:
                    System.out.print("Enter Side: ");
                    double s = sc.nextDouble();
                    shape = new Square(s);
                    break;
                case 4:
                    System.out.print("Enter Radius: ");
                    r = sc.nextDouble();
                    shape = new Sphere(r);
                    volume = (Volume) shape;
                    break;
                case 5:
                    System.out.print("Enter Radius: ");
                    r = sc.nextDouble();
                    System.out.print("Enter Height: ");
                    double h = sc.nextDouble();
                    shape = new Cylinder(r, h);
                    volume = (Volume) shape;
                    break;
                case 6:
                    System.out.print("Enter Base Side: ");
                    double b = sc.nextDouble();
                    System.out.print("Enter Height: ");
                    h = sc.nextDouble();
                    shape = new EquilateralPyramid(b, h);
                    volume = (Volume) shape;
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    continue;
            }

            // Display Results
            System.out.println("\nShape: " + shape.getShapeName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());

            if (volume != null) {
                System.out.println("Volume: " + volume.calculateVolume());
            }
        } while (choice != 7);

        sc.close();
    }
}
