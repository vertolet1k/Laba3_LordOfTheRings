package builder;

import model.Orc;

public class OrcBuilderDirector {
    private OrcBuilder builder;

    public OrcBuilderDirector(OrcBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(OrcBuilder builder) {
        this.builder = builder;
    }

    public Orc constructBasicOrc() {
        return builder
            .buildName()
            .buildWeapon()
            .buildArmor()
            .buildStats()
            .getResult();
    }

    public Orc constructLeaderOrc() {
        return builder
            .buildName()
            .buildWeapon()
            .buildArmor()
            .buildBanner()
            .buildStats()
            .getResult();
    }

    public Orc constructScoutOrc() {
        Orc orc = builder
            .buildName()
            .buildArmor()
            .buildStats()
            .getResult();
        orc.setWeapon("Лук");
        return orc;
        
    }
}