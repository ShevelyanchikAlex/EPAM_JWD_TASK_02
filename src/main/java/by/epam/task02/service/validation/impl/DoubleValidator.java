package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

/**
 * DoubleValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class DoubleValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0;
        } else {
            return false;
        }
    }

}
