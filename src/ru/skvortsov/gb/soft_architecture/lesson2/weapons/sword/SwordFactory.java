package ru.skvortsov.gb.soft_architecture.lesson2.weapons.sword;

import ru.skvortsov.gb.soft_architecture.lesson2.weapons.Weapon;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.WeaponFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.WeaponType;

public  class SwordFactory extends WeaponFactory {

    @Override
    public Weapon createWeapon(WeaponType type){
        Weapon weapon = null;

        switch (type){
            case STANDARD -> {
                weapon = new StandardSword();
                break;
            }
            case ELF -> {
                weapon = new ElfSword();
                break;
            }
        }
        return weapon;
    }

}
