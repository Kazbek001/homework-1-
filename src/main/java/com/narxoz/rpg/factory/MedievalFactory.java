package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.PlateArmor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.IronSword;

public class MedievalFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new IronSword(); // Medieval қаруын береді
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor(); // Medieval сауытын береді
    }
}