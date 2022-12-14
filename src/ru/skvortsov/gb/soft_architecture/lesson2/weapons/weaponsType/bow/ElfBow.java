package ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.bow;

import ru.skvortsov.gb.soft_architecture.lesson2.weapons.Bow;

public class ElfBow extends Bow {

    private final int min = 300;
    private final int max = 450;

    private final int damage;

    public ElfBow() {
        this.damage = getValueInTheRange(min, max);
        System.out.println("Создан эльфийский лук с уроном = "+ damage);
    }

    public int getDamage() {
        return damage;
    }
}
