package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private int defense;
    private String name;

    public PlateArmor() {
        this.name = "Heavy Plate Armor";
        this.defense = 50;
    }

    @Override
    public void defend() {
        System.out.println(name + " blocks " + defense + " damage with its thick steel plates!");
    }

    @Override
    public String getName() {
        return name;
    }
}