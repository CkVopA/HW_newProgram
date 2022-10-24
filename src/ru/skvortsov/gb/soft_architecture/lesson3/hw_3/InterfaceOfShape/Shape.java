package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape;

import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes.Circle;

public abstract class Shape {

    public void calculatePerimeterShape(){
        if (this instanceof I_FigurePolygon) ((I_FigurePolygon) this).perimeterOfFigure();
        if (this instanceof Circle) ((I_Circle) this).circumference();
    }

    public void calculateAreaShape(){
        if (this instanceof I_FigurePolygon) ((I_FigurePolygon) this).areaOfFigure();
        if (this instanceof I_Circle) ((I_Circle) this).areaOfCircle();
    }
}
