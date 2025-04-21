/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;
/**
 *
 * @author vika
 */
public class DolGuldurOrcBuilder extends OrcBuilder {
    @Override
    public OrcBuilder buildName() {
        orc.setName(faker.lordOfTheRings().character());
        return this;
    }

    @Override
    public OrcBuilder buildWeapon() {
        orc.setWeapon("Копье");
        return this;
    }

    @Override
    public OrcBuilder buildArmor() {
        orc.setArmor("Кольчуга");
        return this;
    }

    @Override
    public OrcBuilder buildBanner() {
        orc.setBanner("Знамя с пауком");
        return this;
    }

    @Override
    public OrcBuilder buildStats() {
        orc.setStrength(random.nextInt(100));    
        orc.setAgility(random.nextInt(100));     
        orc.setIntelligence(random.nextInt(50)); 
        orc.setHealth(random.nextInt(151));    
        return this;
    }
} 