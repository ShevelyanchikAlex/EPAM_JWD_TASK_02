package by.epam.task02.dao.appliance_factory;

import by.epam.task02.dao.appliance_factory.impl.*;
import by.epam.task02.entity.Appliance;
import org.w3c.dom.NodeList;

public abstract class ApplianceFactory {
    private static final String LAPTOP = "laptop";
    private static final String OVEN = "oven";
    private static final String REFRIGERATOR = "refrigerator";
    private static final String SPEAKERS = "speakers";
    private static final String TABLET_PC = "tabletPC";
    private static final String VACUUM_CLEANER = "vacuumCleaner";

    public abstract Appliance createAppliance(NodeList nodeList);

    public static ApplianceFactory getApplianceFactory(String applianceName) {
        return switch (applianceName) {
            case LAPTOP -> new LaptopFactory();
            case OVEN -> new OvenFactory();
            case REFRIGERATOR -> new RefrigeratorFactory();
            case SPEAKERS -> new SpeakersFactory();
            case TABLET_PC -> new TabletPCFactory();
            case VACUUM_CLEANER -> new VacuumCleanerFactory();
            default -> throw new IllegalArgumentException("No such appliance creator exists");
        };
    }
}
