package by.epam.task02.dao.appliance_factory.impl;

import by.epam.task02.dao.appliance_factory.ApplianceFactory;
import by.epam.task02.dao.constant.DaoExceptionMessage;
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
    private double price;
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private Color color;

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String tabletPCSearchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.TabletPC.valueOf(tabletPCSearchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case BATTERY_CAPACITY -> batteryCapacity = Double.parseDouble(value);
                    case DISPLAY_INCHES -> displayInches = Double.parseDouble(value);
                    case MEMORY_ROM -> memoryRom = Double.parseDouble(value);
                    case FLASH_MEMORY_CAPACITY -> flashMemoryCapacity = Double.parseDouble(value);
                    case COLOR -> color = Color.valueOf(value);
                    default -> throw new IllegalArgumentException(DaoExceptionMessage.ILLEGAL_ARGUMENT_APPLIANCE_FACTORY_EXCEPTION_MSG.getMessage());
                }
            }
        }
        return new TabletPC(price, batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

}
