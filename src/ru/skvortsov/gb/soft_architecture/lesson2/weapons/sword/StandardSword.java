package ru.skvortsov.gb.soft_architecture.lesson2.weapons.sword;

public class StandardSword extends Sword {

    private final int min = 100;
    private final int max = 200;

    private final int damage;

    protected StandardSword() {
        this.damage = getValueInTheRange(min, max);
        System.out.println("Создан стандартный меч с уроном = "+ damage);
    }

    public int getDamage() {
        return damage;
    }
}
