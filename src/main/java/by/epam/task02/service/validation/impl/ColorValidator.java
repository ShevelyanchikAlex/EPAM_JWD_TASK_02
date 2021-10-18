package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.Color;
import by.epam.task02.service.validation.CriteriaValidator;

public class ColorValidator implements CriteriaValidator {

    public ColorValidator() {
    }

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
