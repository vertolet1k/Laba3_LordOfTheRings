/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import factory.OrcGearFactory;
import factory.DolGuldurGearFactory;
/**
 *
 * @author vika
 */
public class DolGuldurOrkBuilderFactory implements OrkBuilderFactory {
    private final OrcGearFactory gearFactory;

    public DolGuldurOrkBuilderFactory() {
        this.gearFactory = new DolGuldurGearFactory();
    }

    @Override
    public OrkBuilder createOrkBuilder() {
        return new OrkBuilder(gearFactory)
            .withBaseStats()
            .asDolGuldurOrc();
    }
} 