package ru.skvortsov.gb.soft_architecture.lesson2.armors.armorFactories;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.Armor;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.ArmorType;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.lightArmor.ElfArmor;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.lightArmor.StandardArmor;

public class LightArmorFactory extends ArmorFactory{

    @Override
    public Armor createArmor(ArmorType type){
        Armor armor = null;

        switch (type){
            case ELF -> {
                armor = new ElfArmor();
            }
            case STANDARD -> {
                armor = new StandardArmor();
            }
        }
        return armor;
    }
}
