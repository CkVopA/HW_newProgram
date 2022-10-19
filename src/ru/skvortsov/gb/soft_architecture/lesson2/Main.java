package ru.skvortsov.gb.soft_architecture.lesson2;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorFactories.ArmorFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorFactories.HardArmorFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorFactories.LightArmorFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.ArmorType;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponFactories.BowFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponFactories.SwordFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponFactories.WeaponFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.WeaponType;

public class Main {
    public static void main(String[] args) {
        WeaponFactory swordFactory = new SwordFactory();
        swordFactory.orderWeapon(WeaponType.ELF);

        WeaponFactory bowFactory = new BowFactory();
        bowFactory.orderWeapon(WeaponType.STANDARD);


        ArmorFactory hardArmorFactory = new HardArmorFactory();
        hardArmorFactory.orderArmor(ArmorType.DWARF);

        ArmorFactory lightArmorFactory = new LightArmorFactory();
        lightArmorFactory.orderArmor(ArmorType.STANDARD);
    }
}
