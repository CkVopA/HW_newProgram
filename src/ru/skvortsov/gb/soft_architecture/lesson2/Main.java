package ru.skvortsov.gb.soft_architecture.lesson2;

import ru.skvortsov.gb.soft_architecture.lesson2.weapons.bow.BowFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.sword.SwordFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.WeaponFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.WeaponType;

public class Main {
    public static void main(String[] args) {
        WeaponFactory swordFactory = new SwordFactory();
        swordFactory.orderWeapon(WeaponType.ELF);

        WeaponFactory bowFactory = new BowFactory();
        bowFactory.orderWeapon(WeaponType.STANDARD);
    }
}
