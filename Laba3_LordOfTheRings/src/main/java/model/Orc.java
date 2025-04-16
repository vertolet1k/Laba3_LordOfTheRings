package model;

import com.github.javafaker.Faker;
import java.util.Random;

public class Orc {
    private String name;
    private String weapon;
    private String armor;
    private String banner;
    
    // Базовые атрибуты
    private int strength;      // 1-100
    private int agility;      // 1-100
    private int intelligence; // 1-50
    private int health;      // 50-200
    private int level;
    private static final Random random = new Random();
    private static final Faker faker = new Faker();

    // Конструктор для Builder паттерна
    public Orc() {
        this.name = faker.lordOfTheRings().character();
        this.strength = random.nextInt(10) + 1;
        this.health = random.nextInt(20) + 10;
        this.level = 1;
    }

    // Геттеры
    public String getName() { return name; }
    public String getWeapon() { return weapon; }
    public String getArmor() { return armor; }
    public String getBanner() { return banner; }
    public int getStrength() { return strength; }
    public int getAgility() { return agility; }
    public int getIntelligence() { return intelligence; }
    public int getHealth() { return health; }
    public int getLevel() { return level; }

    // Сеттеры для Builder паттерна
    public void setName(String name) { this.name = name; }
    public void setWeapon(String weapon) { this.weapon = weapon; }
    public void setArmor(String armor) { this.armor = armor; }
    public void setBanner(String banner) { this.banner = banner; }
    public void setStrength(int strength) { this.strength = strength; }
    public void setAgility(int agility) { this.agility = agility; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }
    public void setHealth(int health) { this.health = health; }

    public void levelUp() {
        level++;
        strength += random.nextInt(3) + 1;
        health += random.nextInt(5) + 2;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return String.format("Орк %s [Снаряжение: %s, %s, %s] [Характеристики: Сила=%d, Ловкость=%d, Интеллект=%d, Здоровье=%d]",
            name, weapon, armor, banner, strength, agility, intelligence, health);
    }
} 