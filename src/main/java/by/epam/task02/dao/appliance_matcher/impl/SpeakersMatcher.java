package by.epam.task02.dao.appliance_matcher.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_matcher.ApplianceMatcherFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Speakers;

/**
 * SpeakersMatcher class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class SpeakersMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Speakers speakers = (Speakers) appliance;
        return switch (SearchCriteriaFieldConst.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> speakers.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> speakers.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> speakers.getPrice() == (double) value;
            case APPLIANCE_NAME -> ApplianceNameConst.SPEAKERS.equals(value);
            case POWER_CONSUMPTION -> (double) value == speakers.getPowerConsumption();
            case NUMBER_OF_SPEAKERS -> (int) value == speakers.getNumberOfSpeakers();
            case CORD_LENGTH -> (double) value == speakers.getCordLength();
            default -> false;
        };
    }
}
