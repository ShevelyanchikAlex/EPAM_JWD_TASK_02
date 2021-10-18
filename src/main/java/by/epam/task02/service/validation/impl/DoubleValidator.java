package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

public class DoubleValidator implements CriteriaValidator {

    public DoubleValidator() {
    }

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0;
        } else {
            return false;
        }
    }

}
