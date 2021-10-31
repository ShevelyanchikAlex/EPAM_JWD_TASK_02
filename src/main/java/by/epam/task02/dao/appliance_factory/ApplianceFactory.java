package by.epam.task02.dao.appliance_factory;

import by.epam.task02.dao.constant.ApplianceTagName;
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
     * @param nodeList {@link NodeList}
     * @return {@link Appliance} specific appliance
     */
    public abstract Appliance createAppliance(NodeList nodeList);

    /**
     * Gets {@link ApplianceFactory} from its applianceName.
     * If an error occurs, an {@link IllegalArgumentException} is thrown.
     *
     * @param applianceName name of {@link Appliance}
     * @return {@link ApplianceFactory} specific ApplianceFactory
     */
    public static ApplianceFactory getApplianceFactory(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopFactory();
                case OVEN -> new OvenFactory();
                case REFRIGERATOR -> new RefrigeratorFactory();
                case SPEAKERS -> new SpeakersFactory();
                case TABLET_PC -> new TabletPCFactory();
                case VACUUM_CLEANER -> new VacuumCleanerFactory();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }
    }

}
