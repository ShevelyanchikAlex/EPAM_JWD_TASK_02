package by.epam.task02.dao.appliance_factory.impl;

import by.epam.task02.dao.appliance_factory.ApplianceFactory;
import by.epam.task02.entity.*;
import by.epam.task02.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class VacuumCleanerFactory extends ApplianceFactory {
    int price;
    int powerConsumption;
    FilterType filterType;
    BagType bagType;
    WandType wandType;
    double motorSpeedRegulation;
    double cleaningWidth;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchCriteria.VacuumCleaner vacuumCleanerSearchCriteria = SearchCriteria.VacuumCleaner.valueOf(nodeList.item(i).getNodeValue().toUpperCase());

                switch (vacuumCleanerSearchCriteria) {
                    case PRICE -> price = Integer.parseInt(value);
                    case POWER_CONSUMPTION -> powerConsumption = Integer.parseInt(value);
                    case FILTER_TYPE -> filterType = FilterType.valueOf(value);
                    case BAG_TYPE -> bagType = BagType.valueOf(value);
                    case WAND_TYPE -> wandType = WandType.valueOf(value);
                    case MOTOR_SPEED_REGULATION -> motorSpeedRegulation = Double.parseDouble(value);
                    case CLEANING_WIDTH -> cleaningWidth = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return new VacuumCleaner(price, powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
