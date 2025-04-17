/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author vika
 */

public class Orc {
    private String name;
    private String weapon;
    private String armor;
    private String banner;
    private int strength;
    private int agility;
    private int intelligence;
    private int health;

    public String getName() { 
        return name; 
    }
    public String getWeapon() { 
        return weapon; 
    }
    public String getArmor() { 
        return armor; 
    }
    public String getBanner() { 
        return banner; 
    }
    public int getStrength() { 
        return strength; 
    }
    public int getAgility() { 
        return agility; 
    }
    public int getIntelligence() { 
        return intelligence; 
    }
    public int getHealth() { 
        return health; 
    }

    public void setName(String name) { 
        this.name = name; 
    }
    public void setWeapon(String weapon) { 
        this.weapon = weapon; 
    }
    public void setArmor(String armor) { 
        this.armor = armor; 
    }
    public void setBanner(String banner) { 
        this.banner = banner; 
    }
    public void setStrength(int strength) { 
        this.strength = strength; 
    }
    public void setAgility(int agility) { 
        this.agility = agility; 
    }
    public void setIntelligence(int intelligence) { 
        this.intelligence = intelligence; 
    }
    public void setHealth(int health) { 
        this.health = health; 
    }

    @Override
    public String toString() {
        return String.format("Орк %s [Снаряжение: %s, %s, %s] [Характеристики: Сила=%d, Ловкость=%d, Интеллект=%d, Здоровье=%d]",
            name, weapon, armor, banner, strength, agility, intelligence, health);
    }
} 