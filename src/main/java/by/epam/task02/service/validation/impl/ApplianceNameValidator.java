package by.epam.task02.service.validation.impl;

import by.epam.task02.dao.constant.ApplianceTagName;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * ApplianceNameValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ApplianceNameValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            ApplianceTagName.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
