/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import builder.OrcBuilder;
import builder.MordorOrcBuilder;
/**
 *
 * @author vika
 */
public class OrcDirector {
    private OrcBuilder builder;

    public OrcDirector(OrcBuilder builder) {
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