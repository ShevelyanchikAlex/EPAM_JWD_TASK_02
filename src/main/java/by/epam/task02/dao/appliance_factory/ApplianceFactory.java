package by.epam.task02.dao.appliance_factory;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.appliance_factory.impl.*;
import by.epam.task02.entity.Appliance;
import org.w3c.dom.NodeList;

public abstract class ApplianceFactory {

    public abstract Appliance createAppliance(NodeList nodeList);

    public static ApplianceFactory getApplianceFactory(String applianceName) {
        return switch (applianceName) {
            case ApplianceNameConstant.LAPTOP -> new LaptopFactory();
            case ApplianceNameConstant.OVEN -> new OvenFactory();
            case ApplianceNameConstant.REFRIGERATOR -> new RefrigeratorFactory();
            case ApplianceNameConstant.SPEAKERS -> new SpeakersFactory();
            case ApplianceNameConstant.TABLET_PC -> new TabletPCFactory();
            case ApplianceNameConstant.VACUUM_CLEANER -> new VacuumCleanerFactory();
            default -> throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG);
        };
    }

}
