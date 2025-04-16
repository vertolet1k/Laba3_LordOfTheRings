package builder;

import factory.OrcGearFactory;
import factory.MordorGearFactory;

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