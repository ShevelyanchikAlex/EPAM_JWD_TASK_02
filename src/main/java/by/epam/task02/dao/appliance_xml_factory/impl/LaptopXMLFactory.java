package by.epam.task02.dao.appliance_xml_factory.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_xml_factory.ApplianceXMLFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Laptop;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * LaptopXMLFactory class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class LaptopXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Laptop laptop = (Laptop) appliance;
        Element laptopElement = document.createElement(ApplianceNameConst.LAPTOP);

        laptopElement.appendChild(createElement(document, SearchCriteriaFieldConst.PRICE.name().toLowerCase(), String.valueOf(laptop.getPrice())));
        laptopElement.appendChild(createElement(document, SearchCriteriaFieldConst.BATTERY_CAPACITY.name().toLowerCase(), String.valueOf(laptop.getBatteryCapacity())));
        laptopElement.appendChild(createElement(document, SearchCriteriaFieldConst.OS.name().toLowerCase(), String.valueOf(laptop.getOs())));
        laptopElement.appendChild(createElement(document, SearchCriteriaFieldConst.MEMORY_ROM.name().toLowerCase(), String.valueOf(laptop.getMemoryRom())));
        laptopElement.appendChild(createElement(document, SearchCriteriaFieldConst.CPU.name().toLowerCase(), String.valueOf(laptop.getCpu())));
        laptopElement.appendChild(createElement(document, SearchCriteriaFieldConst.DISPLAY_INCHES.name().toLowerCase(), String.valueOf(laptop.getDisplayInches())));
        return laptopElement;
    }

}
