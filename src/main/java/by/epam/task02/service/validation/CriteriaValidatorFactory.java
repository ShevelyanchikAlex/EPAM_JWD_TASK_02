package by.epam.task02.service.validation;

import by.epam.task02.constant.ApplianceFieldConstant;
import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.constant.ValidatorNameConstant;
import by.epam.task02.service.validation.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CriteriaValidatorFactory {
    private static final CriteriaValidatorFactory instance = new CriteriaValidatorFactory();
    private final Map<String, CriteriaValidator> validators = new HashMap<>();

    {
        validators.put(ValidatorNameConstant.BAG_TYPE_VALIDATOR_NAME, new BagTypeValidator());
        validators.put(ValidatorNameConstant.COLOR_VALIDATOR_NAME, new ColorValidator());
        validators.put(ValidatorNameConstant.CPU_VALIDATOR_NAME, new CPUValidator());
        validators.put(ValidatorNameConstant.DOUBLE_VALIDATOR_NAME, new DoubleValidator());
        validators.put(ValidatorNameConstant.FILTER_TYPE_VALIDATOR_NAME, new FilterTypeValidator());
        validators.put(ValidatorNameConstant.INT_VALIDATOR_NAME, new IntValidator());
        validators.put(ValidatorNameConstant.OS_VALIDATOR_NAME, new OSValidator());
        validators.put(ValidatorNameConstant.WAND_TYPE_VALIDATOR_NAME, new WandTypeValidator());
    }

    private CriteriaValidatorFactory() {
    }

    public static CriteriaValidatorFactory getInstance() {
        return instance;
    }

    public CriteriaValidator getValidator(String criteriaName) {
        return switch (criteriaName) {
            case ApplianceFieldConstant.BAG_TYPE -> validators.get(ValidatorNameConstant.BAG_TYPE_VALIDATOR_NAME);
            case ApplianceFieldConstant.COLOR -> validators.get(ValidatorNameConstant.COLOR_VALIDATOR_NAME);
            case ApplianceFieldConstant.CPU -> validators.get(ValidatorNameConstant.CPU_VALIDATOR_NAME);
            case ApplianceFieldConstant.FILTER_TYPE -> validators.get(ValidatorNameConstant.FILTER_TYPE_VALIDATOR_NAME);
            case ApplianceFieldConstant.OS -> validators.get(ValidatorNameConstant.OS_VALIDATOR_NAME);
            case ApplianceFieldConstant.WAND_TYPE -> validators.get(ValidatorNameConstant.WAND_TYPE_VALIDATOR_NAME);
            case ApplianceFieldConstant.NUMBER_OF_SPEAKERS -> validators.get(ValidatorNameConstant.INT_VALIDATOR_NAME);
            case ApplianceFieldConstant.PRICE,
                    ApplianceFieldConstant.BATTERY_CAPACITY,
                    ApplianceFieldConstant.CLEANING_WIDTH,
                    ApplianceFieldConstant.MOTOR_SPEED_REGULATION,
                    ApplianceFieldConstant.FLASH_MEMORY_CAPACITY,
                    ApplianceFieldConstant.CORD_LENGTH,
                    ApplianceFieldConstant.OVERALL_CAPACITY,
                    ApplianceFieldConstant.FREEZER_CAPACITY,
                    ApplianceFieldConstant.WIDTH,
                    ApplianceFieldConstant.HEIGHT,
                    ApplianceFieldConstant.DEPTH,
                    ApplianceFieldConstant.CAPACITY,
                    ApplianceFieldConstant.WEIGHT,
                    ApplianceFieldConstant.POWER_CONSUMPTION,
                    ApplianceFieldConstant.DISPLAY_INCHES,
                    ApplianceFieldConstant.MEMORY_ROM -> validators.get(ValidatorNameConstant.DOUBLE_VALIDATOR_NAME);
            default -> throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
        };
    }

}
