/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;
/**
 *
 * @author vika
 */
public class MordorOrcBuilder extends OrcBuilder {
    @Override
    public OrcBuilder buildName() {
        orc.setName(faker.lordOfTheRings().character());
        return this;
    }

    @Override
    public OrcBuilder buildWeapon() {
        orc.setWeapon("Тяжелый меч");
        return this;
    }

    @Override
    public OrcBuilder buildArmor() {
        orc.setArmor("Стальная броня");
        return this;
    }

    @Override
    public OrcBuilder buildBanner() {
        orc.setBanner("Знамя с Красным Оком");
        return this;
    }

    @Override
    public OrcBuilder buildStats() {
        orc.setStrength(random.nextInt(51));
        orc.setAgility(random.nextInt(30));   
        orc.setIntelligence(random.nextInt(50)); 
        orc.setHealth(random.nextInt(101));  
        return this;
    }
} 