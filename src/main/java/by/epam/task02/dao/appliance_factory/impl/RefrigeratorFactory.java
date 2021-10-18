package by.epam.task02.dao.appliance_factory.impl;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.appliance_factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Refrigerator;
import by.epam.task02.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RefrigeratorFactory extends ApplianceFactory {
    int price;
    double powerConsumption;
    double weight;
    double freezerCapacity;
    double overallCapacity;
    double height;
    double width;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchCriteria.Refrigerator refrigeratorSearchCriteria = SearchCriteria.Refrigerator.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (refrigeratorSearchCriteria) {
                    case PRICE -> price = Integer.parseInt(value);
                    case POWER_CONSUMPTION -> powerConsumption = Double.parseDouble(value);
                    case WEIGHT -> weight = Double.parseDouble(value);
                    case FREEZER_CAPACITY -> freezerCapacity = Double.parseDouble(value);
                    case OVERALL_CAPACITY -> overallCapacity = Double.parseDouble(value);
                    case HEIGHT -> height = Double.parseDouble(value);
                    case WIDTH -> width = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }

            }
        }
        return new Refrigerator(price, powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

}
