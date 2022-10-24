package ru.skvortsov.gb.soft_architecture.lesson2.armors.armorFactories;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.Armor;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.ArmorType;

public abstract class ArmorFactory {

    public Armor orderArmor(ArmorType type){
        Armor armor = createArmor(type);

        armor.giveArmorToHero();

        return armor;
    }

    protected abstract Armor createArmor(ArmorType type);
}
