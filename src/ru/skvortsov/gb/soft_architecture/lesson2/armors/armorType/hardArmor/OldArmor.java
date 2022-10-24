package ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.hardArmor;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.HardArmor;

public class OldArmor extends HardArmor {

    private int defend;

    private final int min = 300;
    private final int max = 400;

    public OldArmor() {
        super();
        System.out.println("Создана "+ typeArmor +" старая броня с защитой = " + defend);
    }
}
