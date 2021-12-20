package com.company;

public class Shapes {
    double length;
    double width;
    double height;
    float radius;

    Shapes()
    {
        radius = 0.0F;
    }

    Shapes(double length,double width,double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Shapes(double length)
    {
        this.length = this.width = this.height =  length;
    }

    double Area(double length,double width)
    {
        return length*width;
    }

    float Area(float radius)
    {
        return 2*3.142f*radius*radius;
    }

    double volume(double length,double width,double height)
    {
        return length*width*height;
    }

    double volume(double radius)
    {
        return (4/3.0)*3.142*radius*radius*radius;
    }
}
