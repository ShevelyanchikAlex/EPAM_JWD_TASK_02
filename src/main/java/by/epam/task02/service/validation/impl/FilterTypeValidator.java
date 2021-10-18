package by.epam.task02.service.validation.impl;

import by.epam.task02.entity.FilterType;
import by.epam.task02.service.validation.CriteriaValidator;

public class FilterTypeValidator implements CriteriaValidator {

    public FilterTypeValidator() {
    }

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            FilterType.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
