/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import factory.OrcGearFactory;
import factory.MistyMountainsGearFactory;
/**
 *
 * @author vika
 */
public class MistyMountainsOrkBuilderFactory implements OrkBuilderFactory {
    private final OrcGearFactory gearFactory;

    public MistyMountainsOrkBuilderFactory() {
        this.gearFactory = new MistyMountainsGearFactory();
    }

    @Override
    public OrkBuilder createOrkBuilder() {
        return new OrkBuilder(gearFactory)
            .withBaseStats()
            .asMistyMountainsOrc();
    }
} 