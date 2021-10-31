package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

/**
 * PriceValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class PriceValidator implements CriteriaValidator {
    private final static double MIN_PRICE = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_PRICE;
        } else
            return false;
    }
}
