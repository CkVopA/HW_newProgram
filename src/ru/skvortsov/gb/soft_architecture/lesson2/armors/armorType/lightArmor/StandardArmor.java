package ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.lightArmor;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.LightArmor;

public class StandardArmor extends LightArmor {

    private int defend;

    private final int min = 400;
    private final int max = 500;

    public StandardArmor() {
        this.defend = getValueInTheRange(min, max);
        System.out.println("Создана " + typeArmor + " кожаная броня с защитой = " + defend);
    }
}
