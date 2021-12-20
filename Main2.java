package com.company;

public class Main2 {
    public static void main(String[] args)
    {
        int a=0;
        float b=0.0f;
        double c=0.0;

        //Circle
        Shapes2 circle1 = new Shapes2();
        circle1.Read(c);
        Shapes2 circle2 = new Shapes2(circle1.radius);
        circle2.Area(circle2.radius);
        circle2.Volume(circle2.radius);

        //Square
        Shapes2 square1 = new Shapes2();
        square1.Read(a);
        Shapes2 square2 = new Shapes2(square1);
        square2.Area(square2.length);
        square2.Volume(square2.length, square2.width, square2.height);

        //Rectangle
        Shapes2 rectangle1 = new Shapes2();
        rectangle1.Read(b);
        Shapes2 rectangle2 = new Shapes2(rectangle1);
        rectangle2.Area(rectangle2.length, rectangle2.width);
        rectangle2.Volume(rectangle2.length, rectangle2.width, rectangle2.height);
    }
}
