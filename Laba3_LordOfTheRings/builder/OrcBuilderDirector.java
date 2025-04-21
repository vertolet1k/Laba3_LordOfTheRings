/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import model.Orc;
/**
 *
 * @author vika
 */
public class OrcBuilderDirector {
    private OrcBuilder builder;

    public OrcBuilderDirector(OrcBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(OrcBuilder builder) {
        this.builder = builder;
    }

    public Orc constructBasicOrc() {
        return builder.buildName().buildWeapon().buildArmor().buildStats().getResult();
    }

    public Orc constructLeaderOrc() {
        return builder.buildName().buildWeapon().buildArmor().buildStats().buildBanner().getResult();
    }

    public Orc constructScoutOrc() {
        Orc orc = builder.buildName().buildArmor().buildStats().getResult();
        orc.setWeapon("Лук");
        return orc;
        
    }
}