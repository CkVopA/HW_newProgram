package ru.skvortsov.gb.soft_architecture.lesson3.scholerType;

import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.Iloveble;
import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.Schooler;

public class SeniorScholer extends Schooler implements Iloveble {
    public void study(){
        System.out.println("Я должен учиться");
    }

    @Override
    public void love() {
        System.out.println("Я хочу любви!!!");
    }
}
