package by.epam.task02.dao.appliance_xml_factory.impl;

import by.epam.task02.constant.ApplianceNameConst;
import by.epam.task02.constant.SearchCriteriaFieldConst;
import by.epam.task02.dao.appliance_xml_factory.ApplianceXMLFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.TabletPC;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * TabletPCXMLFactory class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class TabletPCXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;
        Element tabletPCElement = document.createElement(ApplianceNameConst.TABLET_PC);

        tabletPCElement.appendChild(createElement(document, SearchCriteriaFieldConst.PRICE.name().toLowerCase(), String.valueOf(tabletPC.getPrice())));
        tabletPCElement.appendChild(createElement(document, SearchCriteriaFieldConst.BATTERY_CAPACITY.name().toLowerCase(), String.valueOf(tabletPC.getBatteryCapacity())));
        tabletPCElement.appendChild(createElement(document, SearchCriteriaFieldConst.DISPLAY_INCHES.name().toLowerCase(), String.valueOf(tabletPC.getDisplayInches())));
        tabletPCElement.appendChild(createElement(document, SearchCriteriaFieldConst.MEMORY_ROM.name().toLowerCase(), String.valueOf(tabletPC.getMemoryRom())));
        tabletPCElement.appendChild(createElement(document, SearchCriteriaFieldConst.FLASH_MEMORY_CAPACITY.name().toLowerCase(), String.valueOf(tabletPC.getFlashMemoryCapacity())));
        tabletPCElement.appendChild(createElement(document, SearchCriteriaFieldConst.COLOR.name().toLowerCase(), String.valueOf(tabletPC.getColor())));
        return tabletPCElement;
    }
}
