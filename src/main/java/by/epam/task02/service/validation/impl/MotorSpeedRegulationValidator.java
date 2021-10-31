package by.epam.task02.service.validation.impl;

import by.epam.task02.service.validation.CriteriaValidator;

/**
 * MotorSpeedRegulationValidator class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class MotorSpeedRegulationValidator implements CriteriaValidator {
    private final static double MIN_MOTOR_SPEED_REGULATION = 0.0;
    private final static double MAX_MOTOR_SPEED_REGULATION = 200000.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double motorSpeedRegulation = (Double) value;
            return ((motorSpeedRegulation > MIN_MOTOR_SPEED_REGULATION) && (motorSpeedRegulation < MAX_MOTOR_SPEED_REGULATION));
        } else {
            return false;
        }
    }
}
