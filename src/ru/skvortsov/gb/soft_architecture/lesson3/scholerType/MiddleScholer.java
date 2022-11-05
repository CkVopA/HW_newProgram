package ru.skvortsov.gb.soft_architecture.lesson3.scholerType;

import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.IPlayable;
import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.ISmokable;
import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.Schooler;

public class MiddleScholer extends Schooler implements ISmokable, IPlayable {
    public void study(){
        System.out.println("Я ненавижу учиться");
    }
    public void play(){
        System.out.println("Я играю в игрушки");
    }
    public void smoke(){
        System.out.println("Я начинаю курить");
    }
}
