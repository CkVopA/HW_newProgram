package ru.skvortsov.gb.soft_architecture.lesson2.weapons;

public abstract class WeaponFactory {

    public Weapon orderWeapon(WeaponType type){
        Weapon weapon = createWeapon(type);

        weapon.giveWeaponToHero();

        return weapon;
    }

    protected abstract Weapon createWeapon(WeaponType type);

}
