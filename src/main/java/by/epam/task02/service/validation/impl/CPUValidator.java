package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.CPU;
import by.epam.task02.service.validation.CriteriaValidator;

public class CPUValidator implements CriteriaValidator {

    public CPUValidator() {
    }

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
