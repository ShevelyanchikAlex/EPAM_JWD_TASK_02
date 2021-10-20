package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.WandType;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * WandTypeValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class WandTypeValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            WandType.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
