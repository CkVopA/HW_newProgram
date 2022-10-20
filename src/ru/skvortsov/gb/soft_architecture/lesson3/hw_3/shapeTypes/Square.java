package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes;

import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.I_Square;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.Shape;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException.NegativeValue_Exception;

public class Square extends Shape implements I_Square {
    private int sideLength;

    public Square(int sideLength) throws NegativeValue_Exception {
        if (sideLength > 0){
            this.sideLength = sideLength;
            System.out.println("Создан квадрат со сторонами "+sideLength);
        } else {
            throw new NegativeValue_Exception();
        }

    }

    @Override
    public void perimeterOfSquare() {
        double perimeter = sideLength*4;
        System.out.println("Периметр квадрата = " + perimeter);
    }

    @Override
    public void areaOfSquare() {
        double area = sideLength * sideLength;
        System.out.println("Площадь квадрата = "+ area);
    }
}
