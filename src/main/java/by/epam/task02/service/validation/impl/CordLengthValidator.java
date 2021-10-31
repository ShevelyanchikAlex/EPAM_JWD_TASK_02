package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

/**
 * CordLengthValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class CordLengthValidator implements CriteriaValidator {
    private final static double MIN_CORD_LENGTH = 0.0;
    private final static double MAX_CORD_LENGTH = 100.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double cordLength = (Double) value;
            return ((cordLength > MIN_CORD_LENGTH) && (cordLength < MAX_CORD_LENGTH));
        } else {
            return false;
        }
    }
}
