package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

public class IntValidator implements CriteriaValidator {

    public IntValidator() {
    }

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > 0;
        } else {
            return false;
        }
    }

}
