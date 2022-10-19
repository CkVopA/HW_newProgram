package ru.skvortsov.gb.soft_architecture.lesson2.armors;

public abstract class Armor {
    private int defend;

    protected Armor(int defend) {
        this.defend = defend;
    }

    public void armorDamage(int damage){
        this.defend -= damage;
    }

}
