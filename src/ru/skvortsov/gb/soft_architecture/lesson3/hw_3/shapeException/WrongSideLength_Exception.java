package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException;

public class WrongSideLength_Exception extends InputValuesException{
    public WrongSideLength_Exception(String s){
        super("\n[Неверное значение для параметров фигуры!] \n" + s);
    }
}
