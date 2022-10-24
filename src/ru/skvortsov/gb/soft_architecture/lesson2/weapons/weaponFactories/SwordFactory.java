package ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponFactories;

import ru.skvortsov.gb.soft_architecture.lesson2.weapons.Weapon;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.sword.ElfSword;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.sword.StandardSword;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.WeaponType;

public  class SwordFactory extends WeaponFactory {

    @Override
    public Weapon createWeapon(WeaponType type){
        Weapon weapon = null;

        switch (type){
            case STANDARD -> {
                weapon = new StandardSword();
            }
            case ELF -> {
                weapon = new ElfSword();
            }
            case DWARF -> {
            }
            case GLASS -> {
            }
        }
        return weapon;
    }

}
