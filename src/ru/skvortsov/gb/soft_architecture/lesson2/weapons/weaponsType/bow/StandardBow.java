package ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.bow;

import ru.skvortsov.gb.soft_architecture.lesson2.weapons.Bow;

public class StandardBow extends Bow {

    private final int min = 200;
    private final int max = 300;

    private final int damage;

    public StandardBow() {
        this.damage = getValueInTheRange(min, max);
        System.out.println("Создан стандартный лук с уроном = "+ damage);
    }

    public int getDamage() {
        return damage;
    }
}
