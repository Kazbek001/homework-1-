package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {

    private int defense;
    private String name;

    public EnchantedRobes() {
        this.name = "Mystic Enchanted Robes";
        this.defense = 20; // Low physical defense, but maybe magical resist (logic)
    }

    @Override
    public void defend() {
        System.out.println(name + " creates a magical barrier blocking " + defense + " damage!");
    }

    @Override
    public String getName() {
        return name;
    }
}