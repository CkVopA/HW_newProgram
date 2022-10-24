package ru.skvortsov.gb.soft_architecture.lesson2.armors;

public abstract class Armor {

    public int getValueInTheRange(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void giveArmorToHero() {
        System.out.println("Герой получает броню");
    }
}
