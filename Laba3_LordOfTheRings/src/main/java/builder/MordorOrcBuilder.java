package builder;

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
        orc.setStrength(random.nextInt(51) + 50);
        orc.setAgility(random.nextInt(30) + 1);   
        orc.setIntelligence(random.nextInt(50) + 1); 
        orc.setHealth(random.nextInt(101) + 100);  
        return this;
    }
} 