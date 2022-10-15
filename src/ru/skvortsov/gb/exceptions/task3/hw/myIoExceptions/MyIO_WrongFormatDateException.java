package ru.skvortsov.gb.exceptions.task3.hw.myIoExceptions;

import java.io.IOException;

public class MyIO_WrongFormatDateException extends MyIOException {
    public MyIO_WrongFormatDateException(){
        super("Формат даты рождения должен быть: ДД.ММ.ГГГГ");
    }
}
