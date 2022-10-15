package ru.skvortsov.gb.exceptions.task2;

import java.io.IOException;

public class IoEmptyException extends IOException {
    IoEmptyException(String msg){
        super(msg);
    }
}
