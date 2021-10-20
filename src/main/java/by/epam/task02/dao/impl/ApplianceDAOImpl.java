package by.epam.task02.dao.impl;

import by.epam.task02.constant.ResourceConstant;
import by.epam.task02.dao.ApplianceDAO;
import by.epam.task02.dao.appliance_factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.exception.DaoException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ApplianceDAOImpl class.
 * Implements ApplianceDAO.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ApplianceDAOImpl implements ApplianceDAO {

    /**
     * Reads the information from xml file (the name of this file
     * is ResourceConstant.APPLIANCES_DB_XML, it is in the resource folder).
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        List<Appliance> appliances = new ArrayList<>();
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(Objects.requireNonNull(getClass().getClassLoader().getResource(ResourceConstant.APPLIANCES_DB_XML)).getFile());
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getDocumentElement().getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    ApplianceFactory applianceFactory = ApplianceFactory.getApplianceFactory(node.getNodeName());

                    if (criteria.getGroupSearchName().equals(node.getNodeName())) {
                        Appliance appliance = applianceFactory.createAppliance(node.getChildNodes());

                        if (criteria.getCriteriaMap()
                                .entrySet()
                                .stream()
                                .allMatch(entry -> appliance.isMatchesCriteria(entry.getKey(), entry.getValue()))) {
                            appliances.add(appliance);
                        }
                    }
                }
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new DaoException(e);
        }
        return appliances;
    }

}