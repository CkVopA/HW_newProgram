package ru.skvortsov.gb.soft_architecture.lesson3.hw_3;

import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.InterfaceOfShape.Shape;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException.WrongSideLength_Exception;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes.Circle;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes.Rectangle;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes.Square;
import ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeTypes.Triangle;

/**
 * Написать любом языке программирования, в которой идёт со следующими геометрическими фигурами:
 * 1. Треугольник  * 2. Квадрат  * 3. Прямоугольник.  * 4. Круг
 *
 * В программе имеется массив фигур, с которым можно сделать следующие операции:
 * 1. Добавить новую фигуру
 * 2. Посчитать периметр у всех фигур
 * 3. Посчитать площадь у всех фигур
 *
 * Для фигуры использовать базовый абстрактный класс фигуры, у которого есть методы посчитать периметр и посчитать
 * площадь фигуры. Массив фигур в программе должен быть представлен как массив объектов этого базового класса.
 * Массив фигур должен создаваться и вся работа с ним идёт внутри main.
 * При создании фигур необходимо осуществлять проверку входных данных на возможность создания данной фигуры и
 * в случае ошибки выдавать соответствующие сообщения.
 */

public class Main {
        public static void main(String[] args) throws WrongSideLength_Exception {
        Shape tr1 = new Triangle(3,5,7);
        Shape sq1 = new Square(5);
        Shape re1 = new Rectangle(2, 6);
        Shape ci1 = new Circle(5);
        System.out.println("----------------------------------------");
//        Shape tr2 = new Triangle(2,6,8);
//        Shape sq2 = new Square(2);
//        Shape re2 = new Rectangle(3, 5);
//        Shape ci2 = new Circle(-9);


        Shape[] arrShape = {tr1, sq1, re1, ci1};
        for (Shape s: arrShape) {
            s.calculatePerimeterShape();
            s.calculateAreaShape();
        }
    }
}
