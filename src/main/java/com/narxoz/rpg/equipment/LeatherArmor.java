package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {

    private int defense;
    private String name;

    public LeatherArmor() {
        this.name = "Hunter's Leather Armor";
        this.defense = 30;
    }

    @Override
    public void defend() {
        System.out.println(name + " allows quick movement, dodging " + defense + " damage!");
    }

    @Override
    public String getName() {
        return name;
    }
}