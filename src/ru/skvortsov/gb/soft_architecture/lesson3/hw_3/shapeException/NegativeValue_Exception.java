package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException;

public class NegativeValue_Exception extends WrongSideLength_Exception{
    public NegativeValue_Exception(){
        super("Значение не может быть отрицательным!");
    }
}
