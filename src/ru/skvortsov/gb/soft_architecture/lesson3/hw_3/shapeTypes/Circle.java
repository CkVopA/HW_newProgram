package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes;

import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.I_Circle;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.Shape;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException.NegativeValue_Exception;

public class Circle extends Shape implements I_Circle {
    private final int radius;

    public Circle(int radius) throws NegativeValue_Exception {
        if (radius > 0){
            this.radius = radius;
            System.out.println("Создана окружность с радиусом = "+ radius);
        } else {
            throw new NegativeValue_Exception();
        }
    }

    @Override
    public void circumference() {
        double circumference = 2*Math.PI*radius;
        System.out.println("Длина окружности = "+ circumference);
    }

    @Override
    public void areaOfCircle() {
        double s = Math.PI*radius*radius;
        System.out.println("Площадь окружности = "+ s);
    }
}
