package by.epam.task02.dao.appliance_xml_factory.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_xml_factory.ApplianceXMLFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.VacuumCleaner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * VacuumCleanerXMLFactory class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class VacuumCleanerXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
        Element vacuumCleanerElement = document.createElement(ApplianceNameConst.VACUUM_CLEANER);

        vacuumCleanerElement.appendChild(createElement(document, SearchCriteriaFieldConst.PRICE.name().toLowerCase(), String.valueOf(vacuumCleaner.getPrice())));
        vacuumCleanerElement.appendChild(createElement(document, SearchCriteriaFieldConst.POWER_CONSUMPTION.name().toLowerCase(), String.valueOf(vacuumCleaner.getPowerConsumption())));
        vacuumCleanerElement.appendChild(createElement(document, SearchCriteriaFieldConst.FILTER_TYPE.name().toLowerCase(), String.valueOf(vacuumCleaner.getFilterType())));
        vacuumCleanerElement.appendChild(createElement(document, SearchCriteriaFieldConst.BAG_TYPE.name().toLowerCase(), String.valueOf(vacuumCleaner.getBagType())));
        vacuumCleanerElement.appendChild(createElement(document, SearchCriteriaFieldConst.WAND_TYPE.name().toLowerCase(), String.valueOf(vacuumCleaner.getWandType())));
        vacuumCleanerElement.appendChild(createElement(document, SearchCriteriaFieldConst.MOTOR_SPEED_REGULATION.name().toLowerCase(), String.valueOf(vacuumCleaner.getMotorSpeedRegulation())));
        vacuumCleanerElement.appendChild(createElement(document, SearchCriteriaFieldConst.CLEANING_WIDTH.name().toLowerCase(), String.valueOf(vacuumCleaner.getCleaningWidth())));
        return vacuumCleanerElement;
    }
}
