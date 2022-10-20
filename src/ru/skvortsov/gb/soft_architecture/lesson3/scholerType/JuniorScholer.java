package ru.skvortsov.gb.soft_architecture.lesson3.scholerType;

import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.IPlayable;
import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.Schooler;

public class JuniorScholer extends Schooler implements IPlayable {
    public void study(){
        System.out.println("Я люблю учиться");
    }

    public void play(){
        System.out.println("Я играю в игрушки");
    }
}
