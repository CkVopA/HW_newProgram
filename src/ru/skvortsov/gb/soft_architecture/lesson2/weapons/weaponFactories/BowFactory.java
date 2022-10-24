package ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponFactories;

import ru.skvortsov.gb.soft_architecture.lesson2.weapons.Weapon;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.bow.ElfBow;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.bow.StandardBow;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.WeaponType;

public  class BowFactory extends WeaponFactory {

    @Override
    public Weapon createWeapon(WeaponType type){
        Weapon weapon = null;

        switch (type){
            case STANDARD -> {
                weapon = new StandardBow();
            }
            case ELF -> {
                weapon = new ElfBow();
            }
        }
        return weapon;
    }

}
