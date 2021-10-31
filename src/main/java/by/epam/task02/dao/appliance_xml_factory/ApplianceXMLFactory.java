package by.epam.task02.dao.appliance_xml_factory;

import by.epam.task02.dao.appliance_xml_factory.impl.*;
import by.epam.task02.dao.constant.ApplianceTagName;
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
     * Creates an {@link Appliance} in xml-file.
     *
     * @param document  containing information about the elements in the file
     * @param appliance added {@link Appliance}
     * @return {@link Node}
     */
    public abstract Node createApplianceXML(Document document, Appliance appliance);

    /**
     * Convenient method for adding children to element.
     *
     * @param document     containing information about the elements in the file
     * @param fieldTagName name of element-tag
     * @param value        value if this element-tag
     * @return {@link Node}
     */
    protected final Node createElement(Document document, String fieldTagName, Object value) {
        Element node = document.createElement(fieldTagName.toLowerCase().replace('_', '-'));
        node.appendChild(document.createTextNode(String.valueOf(value)));
        return node;
    }

    /**
     * Gets the {@link by.epam.task02.dao.appliance_factory.ApplianceFactory} from its applianceName.
     * If an error occurs, an {@link IllegalArgumentException} is thrown.
     *
     * @param applianceName name of appliance
     * @return {@link by.epam.task02.dao.appliance_factory.ApplianceFactory}
     */
    public static ApplianceXMLFactory getApplianceXMLFactory(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopXMLFactory();
                case OVEN -> new OvenXMLFactory();
                case REFRIGERATOR -> new RefrigeratorXMLFactory();
                case SPEAKERS -> new SpeakersXMLFactory();
                case TABLET_PC -> new TabletPCXMLFactory();
                case VACUUM_CLEANER -> new VacuumCleanerXMLFactory();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }

    }
}
