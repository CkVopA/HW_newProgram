package ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.hardArmor;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.HardArmor;

public class DwarfArmor extends HardArmor {

    private int defend;

    private final int min = 800;
    private final int max = 1000;

    public DwarfArmor() {
        this.defend = getValueInTheRange(min, max);
        System.out.println("Создана "+ typeArmor +" гномья броня с защитой = " + defend);
    }
}
