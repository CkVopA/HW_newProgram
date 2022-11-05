package ru.skvortsov.gb.soft_architecture.lesson3.hw_3.shapeException;

import java.io.IOException;

public abstract class InputValuesException extends IOException {
    public InputValuesException(String s) {
        super(s);
    }
}
