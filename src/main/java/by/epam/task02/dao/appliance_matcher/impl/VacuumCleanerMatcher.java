package by.epam.task02.dao.appliance_matcher.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_matcher.ApplianceMatcherFactory;
import by.epam.task02.entity.*;

/**
 * VacuumCleanerMatcher class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class VacuumCleanerMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
        return switch (SearchCriteriaFieldConst.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> vacuumCleaner.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> vacuumCleaner.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> vacuumCleaner.getPrice() == (double) value;
            case APPLIANCE_NAME -> ApplianceNameConst.VACUUM_CLEANER.equals(value);
            case POWER_CONSUMPTION -> vacuumCleaner.getPowerConsumption() == (double) value;
            case FILTER_TYPE -> vacuumCleaner.getFilterType().equals(FilterType.valueOf((String) value));
            case BAG_TYPE -> vacuumCleaner.getBagType().equals(BagType.valueOf((String) value));
            case WAND_TYPE -> vacuumCleaner.getWandType().equals(WandType.valueOf((String) value));
            case MOTOR_SPEED_REGULATION -> vacuumCleaner.getMotorSpeedRegulation() == (double) value;
            case CLEANING_WIDTH -> vacuumCleaner.getCleaningWidth() == (double) value;
            default -> false;
        };
    }
}