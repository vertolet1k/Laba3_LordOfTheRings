package builder;

import factory.OrcGearFactory;
import factory.MistyMountainsGearFactory;

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