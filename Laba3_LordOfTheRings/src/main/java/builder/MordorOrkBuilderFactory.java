/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import factory.OrcGearFactory;
import factory.MordorGearFactory;
/**
 *
 * @author vika
 */
public class MordorOrkBuilderFactory implements OrkBuilderFactory {
    private final OrcGearFactory gearFactory;

    public MordorOrkBuilderFactory() {
        this.gearFactory = new MordorGearFactory();
    }

    @Override
    public OrkBuilder createOrkBuilder() {
        return new OrkBuilder(gearFactory)
            .withBaseStats()
            .asMordorOrc();
    }
} 