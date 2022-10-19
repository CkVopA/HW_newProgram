package ru.skvortsov.gb.soft_architecture.lesson2.weapons;

public abstract class Weapon {

    public  void giveWeaponToHero(){
        System.out.println("Герой получает оружие");
    }

    public int getValueInTheRange(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
