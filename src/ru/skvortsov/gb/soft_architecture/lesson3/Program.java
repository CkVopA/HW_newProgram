package ru.skvortsov.gb.soft_architecture.lesson3;


import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.IPlayable;
import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.ISmokable;
import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.Iloveble;
import ru.skvortsov.gb.soft_architecture.lesson3.interfaceAction.Schooler;
import ru.skvortsov.gb.soft_architecture.lesson3.scholerType.JuniorScholer;
import ru.skvortsov.gb.soft_architecture.lesson3.scholerType.MiddleScholer;
import ru.skvortsov.gb.soft_architecture.lesson3.scholerType.SeniorScholer;

public class Program {

    public static void main(String[] args) {
        JuniorScholer juniorScholer = new JuniorScholer();
        MiddleScholer middleScholer = new MiddleScholer();
        SeniorScholer seniorScholer = new SeniorScholer();

        printScholerInfo(juniorScholer);
        printScholerInfo(middleScholer);
        printScholerInfo(seniorScholer);
    }

    public static void printScholerInfo(Schooler schooler){
        schooler.study();
        if (schooler instanceof Iloveble){
            ((Iloveble) schooler).love();
        }
        if (schooler instanceof IPlayable){
            ((IPlayable) schooler).play();
        }
        if (schooler instanceof ISmokable){
            ((ISmokable) schooler).smoke();
        }
    }
}
