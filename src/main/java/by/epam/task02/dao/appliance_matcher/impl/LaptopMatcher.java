package by.epam.task02.dao.appliance_matcher.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_matcher.ApplianceMatcherFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.CPU;
import by.epam.task02.entity.Laptop;
import by.epam.task02.entity.OS;

/**
 * LaptopMatcher class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class LaptopMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Laptop laptop = (Laptop) appliance;
        return switch (SearchCriteriaFieldConst.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> laptop.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> laptop.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> laptop.getPrice() == (double) value;
            case APPLIANCE_NAME -> ApplianceNameConst.LAPTOP.equals(value);
            case BATTERY_CAPACITY -> laptop.getBatteryCapacity() == (double) value;
            case OS -> laptop.getOs().equals(OS.valueOf((String) value));
            case MEMORY_ROM -> laptop.getMemoryRom() == (double) value;
            case CPU -> laptop.getCpu().equals(CPU.valueOf((String) value));
            case DISPLAY_INCHES -> laptop.getDisplayInches() == (double) value;
            default -> false;
        };
    }
}
