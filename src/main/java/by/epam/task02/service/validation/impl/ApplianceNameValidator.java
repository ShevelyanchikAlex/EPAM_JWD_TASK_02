package by.epam.task02.service.validation.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.service.validation.CriteriaValidator;

/**
 * ApplianceNameValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ApplianceNameValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            return switch ((String) value) {
                case ApplianceNameConst.LAPTOP,
                        ApplianceNameConst.OVEN,
                        ApplianceNameConst.REFRIGERATOR,
                        ApplianceNameConst.SPEAKERS,
                        ApplianceNameConst.TABLET_PC,
                        ApplianceNameConst.VACUUM_CLEANER -> true;
                default -> false;
            };
        } catch (Exception e) {
            return false;
        }
    }
}
