package builder;

public class MistyMountainsOrcBuilder extends OrcBuilder {
    @Override
    public OrcBuilder buildName() {
        orc.setName(faker.lordOfTheRings().character());
        return this;
    }

    @Override
    public OrcBuilder buildWeapon() {
        orc.setWeapon("Топор");
        return this;
    }

    @Override
    public OrcBuilder buildArmor() {
        orc.setArmor("Кожаная броня");
        return this;
    }

    @Override
    public OrcBuilder buildBanner() {
        orc.setBanner("Знамя с Луной");
        return this;
    }

    @Override
    public OrcBuilder buildStats() {
        orc.setStrength(random.nextInt(30) + 1);     
        orc.setAgility(random.nextInt(51) + 50);     
        orc.setIntelligence(random.nextInt(20) + 1); 
        orc.setHealth(random.nextInt(151) + 50);     
        return this;
    }
} 