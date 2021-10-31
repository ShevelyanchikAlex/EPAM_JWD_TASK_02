package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

/**
 * WeightValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class WeightValidator implements CriteriaValidator {
    private final static double MIN_WEIGHT = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_WEIGHT;
        } else {
            return false;
        }
    }
}
