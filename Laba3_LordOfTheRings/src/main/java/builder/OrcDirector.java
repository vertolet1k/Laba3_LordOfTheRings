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
        
        if (builderFactory instanceof MordorOrkBuilderFactory) {
            builder.withWeapon(); 
        } else {
            Orc orc = builder.build();
            orc.setWeapon("Лук");
            return orc;
        }
        
        return builder.build();
    }
} 