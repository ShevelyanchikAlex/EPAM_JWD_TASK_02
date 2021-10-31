package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

/**
 * NumberOfSpeakersValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class NumberOfSpeakersValidator implements CriteriaValidator {
    private final static double MIN_NUMBER_OF_SPEAKERS = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > MIN_NUMBER_OF_SPEAKERS;
        } else {
            return false;
        }
    }
}
