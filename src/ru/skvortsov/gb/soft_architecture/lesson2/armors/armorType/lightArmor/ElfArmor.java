package ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.lightArmor;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.LightArmor;

public class ElfArmor extends LightArmor {

    private final int defend;

    private final int min = 600;
    private final int max = 700;

    public ElfArmor() {
        this.defend = getValueInTheRange(min, max);
        System.out.println("Создана "+ typeArmor +" эльфийская броня с защитой = " + defend);
    }
}
