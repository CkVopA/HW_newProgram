package ru.skvortsov.gb.soft_architecture.lesson2.weapons.bow;

import ru.skvortsov.gb.soft_architecture.lesson2.weapons.Weapon;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.WeaponFactory;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.WeaponType;

public  class BowFactory extends WeaponFactory {

    @Override
    public Weapon createWeapon(WeaponType type){
        Weapon weapon = null;

        switch (type){
            case STANDARD -> {
                weapon = new StandardBow();
                break;
            }
            case ELF -> {
                weapon = new ElfBow();
                break;
            }
        }
        return weapon;
    }

}
