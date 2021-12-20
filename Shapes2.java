package com.company;
import java.util.Scanner;
public class Shapes2 {
    double length;
    double width;
    double height;
    float radius;
    Scanner sc = new Scanner(System.in);
    Shapes2()
    {
        length = 0.0;
        width = 0.0;
        height = 0.0;
        radius = 0.0f;
    }

    //square and rectangle
    Shapes2(Shapes2 obj)
    {
        this.length = obj.length;
        this.width = obj.width;
        this.height = obj.height;
        this.radius = obj.radius;
    }

    //circle
    Shapes2(float radius)
    {
        this.radius = radius;
    }

    //square
    void Read(int a)
    {
        System.out.print("Enter the length of sides of square: ");
        this.length = this.width = this.height = sc.nextDouble();
    }

    //rectangle
    void Read(float b)
    {
        System.out.print("Enter the values for length and breadth: ");
        this.length = sc.nextDouble();
        this.width = sc.nextDouble();

        System.out.println("Enter the value for the height of cuboid");
        this.height = sc.nextDouble();
    }

    //circle
    void Read(double c)
    {
        System.out.print("Enter the radius of circle");
        this.radius = sc.nextFloat();
    }

    //Area of square
    void Area(double length)
    {
        double area;
        area = length*length;
        System.out.println("The area of square is: "+area);
    }

    //Area of rectangle
    void Area(double length,double width)
    {
        double area;
        area = length*width;
        System.out.println("The area of rectangle is: "+area);
    }

    //Area of circle
    void Area(float radius)
    {
        float area;
        area = 3.142f*radius*radius;
        System.out.println("The area of circle is: "+area);
    }

    //Volume of cube and cuboid
    void Volume(double length,double width,double height)
    {
        double volume;
        volume = length*width*height;
        System.out.println("The volume is: "+volume);
    }

    //Volume of sphere
    void Volume(float radius)
    {
        float volume;
        volume = (4/3.0f)*3.142f*radius*radius*radius;
        System.out.println("The volume of sphere is: "+volume);
    }
}
