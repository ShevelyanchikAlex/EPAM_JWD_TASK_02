package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.BagType;
import by.epam.task02.service.validation.CriteriaValidator;

public class BagTypeValidator implements CriteriaValidator {

    public BagTypeValidator() {
    }

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            BagType.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
