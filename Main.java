package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        float r;
        double l,b,h;
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        while(t)
        {
            System.out.println("-----Shapes-----");
            System.out.println("1.Circle / Sphere");
            System.out.println("2.Square / Cube");
            System.out.println("3.Rectangle / Cuboid");
            System.out.println("Enter your choice");
                int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    Shapes circle = new Shapes();
                    System.out.println("Enter the radius");
                    circle.radius = sc.nextFloat();
                    r = circle.radius;
                    System.out.println("The area of circle is : " + circle.Area(r));
                    System.out.println("The volume of sphere is : " + circle.volume(r));
                }
                case 2 -> {
                    System.out.println("Enter the length of sides");
                    l = b = h = sc.nextDouble();
                    Shapes square = new Shapes(l);
                    System.out.println("The area of square is: " + square.Area(l, b));
                    System.out.println("The volume of cube is: " + square.volume(l, b, h));
                }
                case 3 -> {
                    System.out.println("Enter the length and breadth");
                    l = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Enter the height for cuboid");
                    h = sc.nextDouble();
                    Shapes rectangle = new Shapes(l, b, h);
                    System.out.println("The area of square is: " + rectangle.Area(l, b));
                    System.out.println("The volume of cube is: " + rectangle.volume(l, b, h));
                }
                default -> t = false;
            }
        }
    }
}
