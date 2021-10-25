package by.epam.task02.dao.appliance_xml_factory.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_xml_factory.ApplianceXMLFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Refrigerator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * RefrigeratorXMLFactory class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class RefrigeratorXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;
        Element refrigeratorElement = document.createElement(ApplianceNameConst.REFRIGERATOR);

        refrigeratorElement.appendChild(createElement(document, SearchCriteriaFieldConst.PRICE.name().toLowerCase(), String.valueOf(refrigerator.getPrice())));
        refrigeratorElement.appendChild(createElement(document, SearchCriteriaFieldConst.POWER_CONSUMPTION.name().toLowerCase(), String.valueOf(refrigerator.getPowerConsumption())));
        refrigeratorElement.appendChild(createElement(document, SearchCriteriaFieldConst.WEIGHT.name().toLowerCase(), String.valueOf(refrigerator.getWeight())));
        refrigeratorElement.appendChild(createElement(document, SearchCriteriaFieldConst.FREEZER_CAPACITY.name().toLowerCase(), String.valueOf(refrigerator.getFreezerCapacity())));
        refrigeratorElement.appendChild(createElement(document, SearchCriteriaFieldConst.OVERALL_CAPACITY.name().toLowerCase(), String.valueOf(refrigerator.getOverallCapacity())));
        refrigeratorElement.appendChild(createElement(document, SearchCriteriaFieldConst.HEIGHT.name().toLowerCase(), String.valueOf(refrigerator.getHeight())));
        refrigeratorElement.appendChild(createElement(document, SearchCriteriaFieldConst.WIDTH.name().toLowerCase(), String.valueOf(refrigerator.getWidth())));
        return refrigeratorElement;
    }
}
