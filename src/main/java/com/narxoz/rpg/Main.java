package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG GAME STARTED ===\n");

        // ---------------------------------------------------------
        //  (Warrior + Medieval Set)
        // ---------------------------------------------------------

        //
        CharacterFactory warriorFactory = new WarriorFactory();
        //
        Character arthur = warriorFactory.createCharacter("King Arthur");

        //
        EquipmentFactory medievalFactory = new MedievalFactory();
        // 4. Қару мен сауытты зауыттан шығарамыз
        Weapon sword = medievalFactory.createWeapon();
        Armor plate = medievalFactory.createArmor();

        // 5. Кейіпкерді киіндіреміз
        arthur.equipWeapon(sword);
        arthur.equipArmor(plate);

        // 6. Нәтижені тексереміз
        arthur.displayStats();
        arthur.attack();
        arthur.defend();

        System.out.println("\n---------------------------------------------------------\n");

        // ---------------------------------------------------------
        // 2-СЦЕНАРИЙ: Сиқыршы (Mage + Magic Set)
        // ---------------------------------------------------------

        CharacterFactory mageFactory = new MageFactory();
        Character gandalf = mageFactory.createCharacter("Gandalf the Grey");

        EquipmentFactory magicFactory = new MagicFactory();
        Weapon staff = magicFactory.createWeapon();
        Armor robe = magicFactory.createArmor();

        gandalf.equipWeapon(staff);
        gandalf.equipArmor(robe);

        gandalf.displayStats();
        gandalf.attack();
        gandalf.defend();

        System.out.println("\n---------------------------------------------------------\n");

        // ---------------------------------------------------------
        // 3-СЦЕНАРИЙ: Садақшы (Archer + Ranger Set)
        // ---------------------------------------------------------

        CharacterFactory archerFactory = new ArcherFactory();
        Character legolas = archerFactory.createCharacter("Legolas");

        EquipmentFactory rangerFactory = new RangerFactory();
        Weapon bow = rangerFactory.createWeapon();
        Armor leather = rangerFactory.createArmor();

        legolas.equipWeapon(bow);
        legolas.equipArmor(leather);

        legolas.displayStats();
        legolas.attack();
        legolas.defend();

        System.out.println("\n=== GAME OVER ===");
    }
}