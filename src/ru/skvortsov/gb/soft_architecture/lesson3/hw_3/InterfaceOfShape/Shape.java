package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape;

public abstract class Shape {

    public void calculatePerimeterShape(){
        if (this instanceof I_Rectangle) ((I_Rectangle) this).perimeterOfRectangle();
        if (this instanceof I_Triangle) ((I_Triangle) this).perimeterOfTriangle();
        if (this instanceof I_Square) ((I_Square) this).perimeterOfSquare();
        if (this instanceof I_Circle) ((I_Circle) this).circumference();
    }

    public void calculateAreaShape(){
        if (this instanceof I_Rectangle) ((I_Rectangle) this).areaOfRectangle();
        if (this instanceof I_Triangle) ((I_Triangle) this).areaOfTriangle();
        if (this instanceof I_Square) ((I_Square) this).areaOfSquare();
        if (this instanceof I_Circle) ((I_Circle) this).areaOfCircle();
    }
}
