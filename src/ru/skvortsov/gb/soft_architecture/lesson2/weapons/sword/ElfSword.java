package ru.skvortsov.gb.soft_architecture.lesson2.weapons.sword;

public class ElfSword extends Sword{

    private final int min = 200;
    private final int max = 350;

    private final int damage;

    protected ElfSword() {
        this.damage = getValueInTheRange(min, max);
        System.out.println("Создан эльфийский меч с уроном = "+ damage);
    }

    public int getDamage() {
        return damage;
    }
}
