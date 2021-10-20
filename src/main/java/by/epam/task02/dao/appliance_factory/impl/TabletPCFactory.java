package by.epam.task02.dao.appliance_factory.impl;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.appliance_factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Color;
import by.epam.task02.entity.TabletPC;
import by.epam.task02.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * TabletPCFactory class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class TabletPCFactory extends ApplianceFactory {
    int price;
    double batteryCapacity;
    double displayInches;
    int memoryRom;
    int flashMemoryCapacity;
    Color color;

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchCriteria.TabletPC tabletPCSearchCriteria = SearchCriteria.TabletPC.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (tabletPCSearchCriteria) {
                    case PRICE -> price = Integer.parseInt(value);
                    case BATTERY_CAPACITY -> batteryCapacity = Double.parseDouble(value);
                    case DISPLAY_INCHES -> displayInches = Double.parseDouble(value);
                    case MEMORY_ROM -> memoryRom = Integer.parseInt(value);
                    case FLASH_MEMORY_CAPACITY -> flashMemoryCapacity = Integer.parseInt(value);
                    case COLOR -> color = Color.valueOf(value);
                    default -> throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }
        return new TabletPC(price, batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

}
