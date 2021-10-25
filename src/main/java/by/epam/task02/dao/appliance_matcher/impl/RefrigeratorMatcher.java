package by.epam.task02.dao.appliance_matcher.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_matcher.ApplianceMatcherFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Refrigerator;

/**
 * RefrigeratorMatcher class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class RefrigeratorMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Refrigerator refrigerator = (Refrigerator) appliance;
        return switch (SearchCriteriaFieldConst.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> refrigerator.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> refrigerator.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> refrigerator.getPrice() == (double) value;
            case APPLIANCE_NAME -> ApplianceNameConst.REFRIGERATOR.equals(value);
            case POWER_CONSUMPTION -> (double) value == refrigerator.getPowerConsumption();
            case WEIGHT -> refrigerator.getWeight() == (double) value;
            case FREEZER_CAPACITY -> refrigerator.getFreezerCapacity() == (double) value;
            case OVERALL_CAPACITY -> refrigerator.getOverallCapacity() == (double) value;
            case HEIGHT -> refrigerator.getHeight() == (double) value;
            case WIDTH -> refrigerator.getWidth() == (double) value;
            default -> false;
        };
    }
}
