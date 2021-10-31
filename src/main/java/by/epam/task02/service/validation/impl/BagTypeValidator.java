package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.BagType;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * BagTypeValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class BagTypeValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            BagType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
