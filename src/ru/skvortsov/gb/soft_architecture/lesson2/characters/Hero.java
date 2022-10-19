package ru.skvortsov.gb.soft_architecture.lesson2.characters;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.Armor;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorFactories.ArmorFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorFactories.HardArmorFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorFactories.LightArmorFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.ArmorType;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.Weapon;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponFactories.BowFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponFactories.SwordFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponFactories.WeaponFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.WeaponType;

public abstract class Hero {
    private final int HEALTH = 1000;
    Armor armor;
    Weapon weapon;

    public Hero(ArmorType armorType, WeaponType weaponType) {
        if (this instanceof Knight){
            System.out.println("На арену выходит РЫЦАРЬ!");
            ArmorFactory hardArmorFactory = new HardArmorFactory();
            armor = hardArmorFactory.orderArmor(armorType);
            WeaponFactory swordFactory = new SwordFactory();
            weapon = swordFactory.orderWeapon(weaponType);
        }
        if (this instanceof Archer){
            System.out.println("На арену выходит ЛУЧНИК!");
            ArmorFactory lightArmorFactory = new LightArmorFactory();
            armor = lightArmorFactory.orderArmor(armorType);
            WeaponFactory bowFactory = new BowFactory();
            weapon = bowFactory.orderWeapon(weaponType);
        }
    }

    private void attack(Hero opponent){

    }



}
