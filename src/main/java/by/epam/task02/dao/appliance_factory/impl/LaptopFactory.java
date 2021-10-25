package by.epam.task02.dao.appliance_factory.impl;

import by.epam.task02.constant.ExceptionMessageConst;
import by.epam.task02.dao.appliance_factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.CPU;
import by.epam.task02.entity.Laptop;
import by.epam.task02.entity.OS;
import by.epam.task02.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * LaptopFactory class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class LaptopFactory extends ApplianceFactory {
    private double price;
    private double batteryCapacity;
    private OS os;
    private double memoryRom;
    private CPU cpu;
    private double displayInches;

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchCriteria.Laptop laptopSearchCriteria = SearchCriteria.Laptop.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (laptopSearchCriteria) {
                    case PRICE -> price = Double.parseDouble(value);
                    case BATTERY_CAPACITY -> batteryCapacity = Double.parseDouble(value);
                    case OS -> os = OS.valueOf(value);
                    case MEMORY_ROM -> memoryRom = Double.parseDouble(value);
                    case CPU -> cpu = CPU.valueOf(value);
                    case DISPLAY_INCHES -> displayInches = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException(ExceptionMessageConst.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }

        return new Laptop(price, batteryCapacity, os, memoryRom, cpu, displayInches);
    }

}
