package ru.skvortsov.gb.soft_architecture.lesson2.armors.armorFactories;

import ru.skvortsov.gb.soft_architecture.lesson2.armors.Armor;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.ArmorType;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.hardArmor.DwarfArmor;
import ru.skvortsov.gb.soft_architecture.lesson2.armors.armorType.hardArmor.OldArmor;

public class HardArmorFactory extends ArmorFactory{

    @Override
    public Armor createArmor(ArmorType type){
        Armor armor = null;

        switch (type){
            case DWARF -> {
                armor = new DwarfArmor();
            }
            case OLD -> {
                armor = new OldArmor();
            }
        }
        return armor;
    }
}
