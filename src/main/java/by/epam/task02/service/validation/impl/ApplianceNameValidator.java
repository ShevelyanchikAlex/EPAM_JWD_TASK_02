package by.epam.task02.service.validation.impl;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.service.validation.CriteriaValidator;

public class ApplianceNameValidator implements CriteriaValidator {

    public ApplianceNameValidator() {
    }

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            return switch ((String) value) {
                case ApplianceNameConstant.LAPTOP,
                        ApplianceNameConstant.OVEN,
                        ApplianceNameConstant.REFRIGERATOR,
                        ApplianceNameConstant.SPEAKERS,
                        ApplianceNameConstant.TABLET_PC,
                        ApplianceNameConstant.VACUUM_CLEANER -> true;
                default -> false;
            };
        } catch (Exception e) {
            return false;
        }
    }
}
