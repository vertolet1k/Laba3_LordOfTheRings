/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import com.github.javafaker.Faker;
import java.util.Random;
import model.Orc;
import factory.OrcGearFactory;
/**
 *
 * @author vika
 */
public class OrkBuilder {
    private static final Random random = new Random();
    private static final Faker faker = new Faker();
    
    private final Orc orc;
    private final OrcGearFactory gearFactory;

    public OrkBuilder(OrcGearFactory gearFactory) {
        this.orc = new Orc();
        this.gearFactory = gearFactory;
    }

    public OrkBuilder withName(String name) {
        orc.setName(name != null ? name : faker.lordOfTheRings().character());
        return this;
    }

    public OrkBuilder withWeapon() {
        orc.setWeapon(gearFactory.createWeapon());
        return this;
    }

    public OrkBuilder withArmor() {
        orc.setArmor(gearFactory.createArmor());
        return this;
    }

    public OrkBuilder withBanner() {
        orc.setBanner(gearFactory.createBanner());
        return this;
    }

    public OrkBuilder withBaseStats() {
        orc.setStrength(random.nextInt(100) + 1);
        orc.setAgility(random.nextInt(100) + 1);
        orc.setIntelligence(random.nextInt(50) + 1);
        orc.setHealth(random.nextInt(151) + 50);
        return this;
    }

    public OrkBuilder asMordorOrc() {
        int strength = (int)(orc.getStrength() * 1.3); 
        orc.setStrength(Math.min(100, strength));
        orc.setAgility((int)(orc.getAgility() * 0.7));
        return this;
    }

    public OrkBuilder asMistyMountainsOrc() {
        int agility = (int)(orc.getAgility() * 1.3); 
        orc.setAgility(Math.min(100, agility));
        orc.setIntelligence((int)(orc.getIntelligence() * 0.7)); 
        return this;
    }

    public OrkBuilder asDolGuldurOrc() {
        return this;
    }

    public Orc build() {
        return orc;
    }
} 