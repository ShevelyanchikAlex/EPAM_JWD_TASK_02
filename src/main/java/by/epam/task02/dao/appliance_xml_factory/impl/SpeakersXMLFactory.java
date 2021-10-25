package by.epam.task02.dao.appliance_xml_factory.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_xml_factory.ApplianceXMLFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Speakers;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * SpeakersXMLFactory class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class SpeakersXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Speakers speakers = (Speakers) appliance;
        Element speakersElement = document.createElement(ApplianceNameConst.SPEAKERS);

        speakersElement.appendChild(createElement(document, SearchCriteriaFieldConst.PRICE.name().toLowerCase(), String.valueOf(speakers.getPrice())));
        speakersElement.appendChild(createElement(document, SearchCriteriaFieldConst.POWER_CONSUMPTION.name().toLowerCase(), String.valueOf(speakers.getPowerConsumption())));
        speakersElement.appendChild(createElement(document, SearchCriteriaFieldConst.NUMBER_OF_SPEAKERS.name().toLowerCase(), String.valueOf(speakers.getNumberOfSpeakers())));
        speakersElement.appendChild(createElement(document, SearchCriteriaFieldConst.CORD_LENGTH.name().toLowerCase(), String.valueOf(speakers.getCordLength())));
        return speakersElement;
    }
}
