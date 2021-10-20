package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.FilterType;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * FilterTypeValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class FilterTypeValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            FilterType.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
