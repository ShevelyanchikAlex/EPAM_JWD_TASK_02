package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.Color;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * ColorValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ColorValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
