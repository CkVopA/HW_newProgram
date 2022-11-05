package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes;

import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.Polygon;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException.NegativeValue_Exception;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException.WrongSideLength_Exception;

public class Triangle extends Polygon {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) throws WrongSideLength_Exception {
        // Правило сторон треугольника утверждает, что сумма длин любых двух сторон треугольника
        // должна быть больше длины третьей стороны.
        if (sideA>0 && sideB>0 && sideC > 0) {
            if (sideA+sideB > sideC && sideA+sideC > sideB && sideB+sideC > sideA){
                this.sideA = sideA;
                this.sideB = sideB;
                this.sideC = sideC;
                System.out.println("Создан треугольник со сторонами "+sideA+", "+sideB+", "+sideC);
            } else {
                String s = "(Сумма длин любых двух сторон треугольника должна быть больше длины третьей стороны)";
                throw new WrongSideLength_Exception(s);
            }
        } else {
            throw new NegativeValue_Exception();
        }
    }

    @Override
    public void calculateAreaFigure() {
        double p = (sideA+sideB+sideC)/2d;
        double resultArea = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));  // Формула Герона
        System.out.println("Площадь треугольника = "+ resultArea);
    }

    @Override
    public void calculatePerimeterFigure() {
        double perimeter = sideA+sideB+sideC;
        System.out.println("Периметр треугольника = "+ perimeter);
    }
}
