package ru.skvortsov.gb.exceptions.task3.hw.myIoExceptions;

import java.io.IOException;

public class MyIO_NotTextException extends MyIOException {
    public MyIO_NotTextException(){
        super("В ФИО доступны только буквенные значения!");
    }
}
