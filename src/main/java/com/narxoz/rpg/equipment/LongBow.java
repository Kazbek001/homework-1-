package com.narxoz.rpg.equipment;

public class LongBow implements Weapon {

    private int damage;
    private String name;

    public LongBow() {
        this.name = "Elven Longbow";
        this.damage = 30;
    }

    @Override
    public void attack() {
        System.out.println("Shoots a precise arrow from " + name + " dealing " + damage + " damage!");
    }

    @Override
    public String getName() {
        return name;
    }
}