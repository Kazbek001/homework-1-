package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {

    private int damage;
    private String name;

    public WizardStaff() {
        this.name = "Elder Wizard Staff";
        this.damage = 40; // Magic damage
    }

    @Override
    public void attack() {
        System.out.println("Casts a fireball from " + name + " dealing " + damage + " magic damage!");
    }

    @Override
    public String getName() {
        return name;
    }
}