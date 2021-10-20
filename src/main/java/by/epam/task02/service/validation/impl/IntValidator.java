package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

/**
 * IntValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class IntValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > 0;
        } else {
            return false;
        }
    }

}
