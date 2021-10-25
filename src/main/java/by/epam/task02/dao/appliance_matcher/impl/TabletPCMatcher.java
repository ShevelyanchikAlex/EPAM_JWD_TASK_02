package by.epam.task02.dao.appliance_matcher.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_matcher.ApplianceMatcherFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Color;
import by.epam.task02.entity.TabletPC;

/**
 * TabletPCMatcher class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class TabletPCMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        TabletPC tabletPC = (TabletPC) appliance;
        return switch (SearchCriteriaFieldConst.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> tabletPC.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> tabletPC.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> tabletPC.getPrice() == (double) value;
            case APPLIANCE_NAME -> ApplianceNameConst.TABLET_PC.equals(value);
            case BATTERY_CAPACITY -> tabletPC.getBatteryCapacity() == (double) value;
            case DISPLAY_INCHES -> tabletPC.getDisplayInches() == (double) value;
            case MEMORY_ROM -> tabletPC.getMemoryRom() == (double) value;
            case FLASH_MEMORY_CAPACITY -> tabletPC.getFlashMemoryCapacity() == (double) value;
            case COLOR -> tabletPC.getColor().equals(Color.valueOf((String) value));
            default -> false;
        };
    }
}
