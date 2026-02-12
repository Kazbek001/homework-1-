package com.narxoz.rpg.equipment;

/**
 * Example concrete weapon implementation - Medieval theme.
 *
 * This is provided as a reference to help you understand the structure.
 * Study this, then create other weapons and armor for different themes.
 *
 * Notice:
 * - This implements the Weapon interface
 * - It has specific attributes for this weapon type
 * - It belongs to the "Medieval" equipment family
 *
 * TODO: Create similar implementations for:
 * Weapons:
 * - WizardStaff (Magic theme)
 * - Longbow (Ranger theme)
 * - Other weapons you imagine...
 *
 * Armor:
 * - PlateArmor (Medieval theme)
 * - EnchantedRobes (Magic theme)
 * - LeatherArmor (Ranger theme)
 * - Other armor you imagine...
 */
public class IronSword implements Weapon {

    private int damage;
    private String name;

    public IronSword() {
        this.name = "Iron Sword";
        this.damage = 25;
    }

    @Override
    public void attack() {
        System.out.println("Swings the " + name + " dealing " + damage + " physical damage!");
    }

    @Override
    public String getName() {
        return name;
    }
}
