package by.epam.task02.dao.appliance_xml_factory.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_xml_factory.ApplianceXMLFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Oven;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * OvenXMLFactory class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class OvenXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Oven oven = (Oven) appliance;
        Element ovenElement = document.createElement(ApplianceNameConst.OVEN);

        ovenElement.appendChild(createElement(document, SearchCriteriaFieldConst.PRICE.name().toLowerCase(), String.valueOf(oven.getPrice())));
        ovenElement.appendChild(createElement(document, SearchCriteriaFieldConst.POWER_CONSUMPTION.name().toLowerCase(), String.valueOf(oven.getPowerConsumption())));
        ovenElement.appendChild(createElement(document, SearchCriteriaFieldConst.WEIGHT.name().toLowerCase(), String.valueOf(oven.getWeight())));
        ovenElement.appendChild(createElement(document, SearchCriteriaFieldConst.CAPACITY.name().toLowerCase(), String.valueOf(oven.getCapacity())));
        ovenElement.appendChild(createElement(document, SearchCriteriaFieldConst.DEPTH.name().toLowerCase(), String.valueOf(oven.getDepth())));
        ovenElement.appendChild(createElement(document, SearchCriteriaFieldConst.HEIGHT.name().toLowerCase(), String.valueOf(oven.getHeight())));
        ovenElement.appendChild(createElement(document, SearchCriteriaFieldConst.WIDTH.name().toLowerCase(), String.valueOf(oven.getWidth())));
        return ovenElement;
    }
}
