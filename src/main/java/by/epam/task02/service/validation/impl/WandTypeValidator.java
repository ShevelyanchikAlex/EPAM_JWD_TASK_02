package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.WandType;
import by.epam.task02.service.validation.CriteriaValidator;

public class WandTypeValidator implements CriteriaValidator {

    public WandTypeValidator() {
    }

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
