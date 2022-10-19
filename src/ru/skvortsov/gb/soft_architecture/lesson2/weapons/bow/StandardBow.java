package ru.skvortsov.gb.soft_architecture.lesson2.weapons.bow;

public class StandardBow extends Bow{

    private final int min = 200;
    private final int max = 300;

    private final int damage;

    protected StandardBow() {
        this.damage = getValueInTheRange(min, max);
        System.out.println("Создан стандартный лук с уроном = "+ damage);
    }

    public int getDamage() {
        return damage;
    }
}
