package ru.skvortsov.gb.soft_architecture.lesson2.characters;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.ArmorType;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.WeaponType;

public class Archer extends Hero{
    public Archer(ArmorType armorType, WeaponType weaponType) {
        super(armorType, weaponType);
    }
}
