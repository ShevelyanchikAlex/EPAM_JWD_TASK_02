package by.epam.task02.dao.appliance_xml_factory;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.ExceptionMessageConst;
import by.epam.task02.dao.appliance_xml_factory.impl.*;
import by.epam.task02.entity.Appliance;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * ApplianceXMLFactory abstract class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public abstract class ApplianceXMLFactory {

    /**
     * Creates an object in xml-file.
     *
     * @param document  containing information about the elements in the file
     * @param appliance added appliance
     * @return Node
     */
    public abstract Node createApplianceXML(Document document, Appliance appliance);

    /**
     * Convenient method for adding children to element.
     *
     * @param document containing information about the elements in the file
     * @param name     name of element-tag
     * @param value    value if this element-tag
     * @return Node
     */
    protected final Node createElement(Document document, String name, String value) {
        Element node = document.createElement(name);
        node.appendChild(document.createTextNode(value));
        return node;
    }

    /**
     * Gets the ApplianceXMLFactory from its applianceName.
     * If an error occurs, an IllegalArgumentException is thrown.
     *
     * @param applianceName name of appliance
     * @return ApplianceXMLFactory
     */
    public static ApplianceXMLFactory getApplianceXMLFactory(String applianceName) {
        return switch (applianceName) {
            case ApplianceNameConst.LAPTOP -> new LaptopXMLFactory();
            case ApplianceNameConst.OVEN -> new OvenXMLFactory();
            case ApplianceNameConst.REFRIGERATOR -> new RefrigeratorXMLFactory();
            case ApplianceNameConst.SPEAKERS -> new SpeakersXMLFactory();
            case ApplianceNameConst.TABLET_PC -> new TabletPCXMLFactory();
            case ApplianceNameConst.VACUUM_CLEANER -> new VacuumCleanerXMLFactory();
            default -> throw new IllegalArgumentException(ExceptionMessageConst.ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG);
        };
    }
}
