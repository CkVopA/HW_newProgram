package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes;

import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.I_FigurePolygon;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.Shape;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException.NegativeValue_Exception;

public class Square extends Shape implements I_FigurePolygon {
    private final int sideA;

    public Square(int sideA) throws NegativeValue_Exception {
        if (sideA > 0){
            this.sideA = sideA;
            System.out.println("Создан квадрат со сторонами "+sideA);
        } else {
            throw new NegativeValue_Exception();
        }
    }

    public void perimeterOfFigure() {
        double perimeter = 4*(sideA);
        System.out.println("Периметр квадрата = "+ perimeter);
    }

    public void areaOfFigure() {
        double area = sideA*sideA;
        System.out.println("Площадь квадрата = "+ area);
    }
}
