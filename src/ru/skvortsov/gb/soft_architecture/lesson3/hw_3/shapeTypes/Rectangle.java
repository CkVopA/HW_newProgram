package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes;

import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.I_Rectangle;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.Shape;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException.NegativeValue_Exception;

public class Rectangle extends Shape implements I_Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) throws NegativeValue_Exception {
        if (sideA>0 && sideB>0){
            this.sideA = sideA;
            this.sideB = sideB;
            System.out.println("Создан прямоугольник со сторонами "+sideA+", "+sideB);
        } else {
            throw new NegativeValue_Exception();
        }


    }

    @Override
    public void perimeterOfRectangle() {
        double perimeter = 2*(sideA+sideB);
        System.out.println("Периметр прямоугольника = "+ perimeter);
    }

    @Override
    public void areaOfRectangle() {
        double area = sideA * sideB;
        System.out.println("Площадь прямоугольника = "+ area);
    }
}
