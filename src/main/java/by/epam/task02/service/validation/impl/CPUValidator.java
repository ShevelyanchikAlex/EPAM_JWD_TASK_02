package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.CPU;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * CPUValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class CPUValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
