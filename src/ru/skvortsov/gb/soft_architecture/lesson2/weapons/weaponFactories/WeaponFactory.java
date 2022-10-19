package ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponFactories;

import ru.skvortsov.gb.soft_architecture.lesson2.weapons.Weapon;
import ru.skvortsov.gb.soft_architecture.lesson2.weapons.weaponsType.WeaponType;

public abstract class WeaponFactory {

    public Weapon orderWeapon(WeaponType type){
        Weapon weapon = createWeapon(type);

        weapon.giveWeaponToHero();

        return weapon;
    }

    protected abstract Weapon createWeapon(WeaponType type);

}
