package builder;

import factory.OrcGearFactory;
import factory.DolGuldurGearFactory;

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