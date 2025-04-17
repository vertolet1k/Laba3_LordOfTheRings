package builder;

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
        orc.setStrength(random.nextInt(100) + 1);    
        orc.setAgility(random.nextInt(100) + 1);     
        orc.setIntelligence(random.nextInt(50) + 1); 
        orc.setHealth(random.nextInt(151) + 50);    
        return this;
    }
} 