package by.epam.task02.dao.appliance_matcher.impl;

import by.epam.task02.dao.constant.ApplianceTagName;
import by.epam.task02.dao.appliance_matcher.ApplianceMatcherFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Oven;
import by.epam.task02.entity.criteria.SearchCriteria;

/**
 * OvenMatcher class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class OvenMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Oven oven = (Oven) appliance;

        return switch (SearchCriteria.OvenWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> oven.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> oven.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> oven.getPrice() == (double) value;
            case NAME -> ApplianceTagName.OVEN.equals(value);
            case POWER_CONSUMPTION -> oven.getPowerConsumption() == (double) value;
            case WEIGHT -> oven.getWeight() == (double) value;
            case CAPACITY -> oven.getCapacity() == (double) value;
            case DEPTH -> oven.getDepth() == (double) value;
            case HEIGHT -> oven.getHeight() == (double) value;
            case WIDTH -> oven.getWidth() == (double) value;
        };
    }
}
