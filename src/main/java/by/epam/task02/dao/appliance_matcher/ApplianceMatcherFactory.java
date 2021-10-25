package by.epam.task02.dao.appliance_matcher;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.ExceptionMessageConst;
import by.epam.task02.dao.appliance_matcher.impl.*;
import by.epam.task02.entity.Appliance;

/**
 * ApplianceMatcherFactory abstract class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public abstract class ApplianceMatcherFactory {
    /**
     * Criterion match method.
     *
     * @param appliance    specific appliance
     * @param criteriaName name of criteria by which the comparison will be made
     * @param value        value to compare by criteria
     * @return true if appliance matches the given criteriaName and value. Otherwise, it returns false.
     */
    public abstract boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value);

    /**
     * Gets the Matcher of appliance from its applianceName.
     * If an error occurs, an IllegalArgumentException is thrown.
     *
     * @param applianceName name of appliance
     * @return ApplianceMatcherFactory
     */
    public static ApplianceMatcherFactory getMatcher(String applianceName) {
        return switch (applianceName) {
            case ApplianceNameConst.LAPTOP -> new LaptopMatcher();
            case ApplianceNameConst.OVEN -> new OvenMatcher();
            case ApplianceNameConst.REFRIGERATOR -> new RefrigeratorMatcher();
            case ApplianceNameConst.SPEAKERS -> new SpeakersMatcher();
            case ApplianceNameConst.TABLET_PC -> new TabletPCMatcher();
            case ApplianceNameConst.VACUUM_CLEANER -> new VacuumCleanerMatcher();
            default -> throw new IllegalArgumentException(ExceptionMessageConst.ILLEGAL_ARGUMENT_MATCHER_FACTORY_EXCEPTION_MSG);
        };
    }
}
