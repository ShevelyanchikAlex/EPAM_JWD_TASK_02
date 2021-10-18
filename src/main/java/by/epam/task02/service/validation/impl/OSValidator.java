package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.OS;
import by.epam.task02.service.validation.CriteriaValidator;

public class OSValidator implements CriteriaValidator {

    public OSValidator() {
    }

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
