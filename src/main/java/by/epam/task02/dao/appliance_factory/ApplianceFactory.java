package by.epam.task02.dao.appliance_factory;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.ExceptionMessageConst;
import by.epam.task02.dao.appliance_factory.impl.*;
import by.epam.task02.entity.Appliance;
import org.w3c.dom.NodeList;

/**
 * ApplianceFactory abstract class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public abstract class ApplianceFactory {

    /**
     * Creates a specific appliance.
     *
     * @param nodeList nodeList
     * @return Appliance specific appliance
     */
    public abstract Appliance createAppliance(NodeList nodeList);

    /**
     * Gets the Factory of appliance from its applianceName.
     * If an error occurs, an IllegalArgumentException is thrown.
     *
     * @param applianceName name of appliance
     * @return ApplianceFactory specific ApplianceFactory
     */
    public static ApplianceFactory getApplianceFactory(String applianceName) {
        return switch (applianceName) {
            case ApplianceNameConst.LAPTOP -> new LaptopFactory();
            case ApplianceNameConst.OVEN -> new OvenFactory();
            case ApplianceNameConst.REFRIGERATOR -> new RefrigeratorFactory();
            case ApplianceNameConst.SPEAKERS -> new SpeakersFactory();
            case ApplianceNameConst.TABLET_PC -> new TabletPCFactory();
            case ApplianceNameConst.VACUUM_CLEANER -> new VacuumCleanerFactory();
            default -> throw new IllegalArgumentException(ExceptionMessageConst.ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG);
        };
    }

}
