package builder;

import model.Orc;

public class OrcDirector {
    private OrkBuilderFactory builderFactory;

    public OrcDirector(OrkBuilderFactory builderFactory) {
        this.builderFactory = builderFactory;
    }

    public Orc createBasicOrc(String name) {
        return builderFactory.createOrkBuilder()
            .withName(name)
            .withWeapon()
            .withArmor()
            .build();
    }

    public Orc createLeaderOrc(String name) {
        return builderFactory.createOrkBuilder()
            .withName(name)
            .withWeapon()
            .withArmor()
            .withBanner()
            .build();
    }

    public Orc createScoutOrc(String name) {
        OrkBuilder builder = builderFactory.createOrkBuilder()
            .withName(name)
            .withArmor();
        
        // Разведчики используют лук вместо стандартного оружия
        if (builderFactory instanceof MordorOrkBuilderFactory) {
            builder.withWeapon(); // У разведчиков Мордора остается стандартное оружие
        } else {
            // Для остальных племен - лук
            Orc orc = builder.build();
            orc.setWeapon("Лук");
            return orc;
        }
        
        return builder.build();
    }
} 