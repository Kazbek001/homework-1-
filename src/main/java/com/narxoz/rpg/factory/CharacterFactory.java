package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

/**
 * Factory Method Pattern: Creator
 * Defines the method that subclasses must implement to create characters.
 */
public abstract class CharacterFactory {

    // Бұл - Factory Method.
    // Нақты қандай кейіпкер жасалатынын балалары (subclasses) шешеді.
    public abstract Character createCharacter(String name);

    // Бұл әдіс кейіпкерді жасап, бірден оның статтарын көрсетеді
    public Character createAndShow(String name) {
        Character character = createCharacter(name);
        System.out.println("--------------------------------------------------");
        System.out.println("Factory created a new hero: " + character.getName());
        character.displayStats();
        return character;
    }
}