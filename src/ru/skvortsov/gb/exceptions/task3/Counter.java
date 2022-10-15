package ru.skvortsov.gb.exceptions.task3;

public class Counter implements AutoCloseable{
    static int count = 0;

    protected void add(){
        count++;
    }

    @Override
    public void close() throws Exception {

    }
}
