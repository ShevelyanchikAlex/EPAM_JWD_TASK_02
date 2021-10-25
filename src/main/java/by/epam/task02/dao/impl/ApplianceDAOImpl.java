package by.epam.task02.dao.impl;

import by.epam.task02.constant.ResourceConst;
import by.epam.task02.dao.ApplianceDAO;
import by.epam.task02.dao.appliance_factory.ApplianceFactory;
import by.epam.task02.dao.appliance_matcher.ApplianceMatcherFactory;
import by.epam.task02.dao.appliance_xml_factory.ApplianceXMLFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.exception.DaoException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
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
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        List<Appliance> appliances = new ArrayList<>();
        Document document = getDocument(ResourceConst.APPLIANCES_DB_XML);
        try {
            NodeList nodeList = document.getDocumentElement().getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    if (criteria.getGroupSearchName().isEmpty() || criteria.getGroupSearchName().equals(node.getNodeName())) {
                        ApplianceFactory applianceFactory = ApplianceFactory.getApplianceFactory(node.getNodeName());
                        Appliance appliance = applianceFactory.createAppliance(node.getChildNodes());

                        if (criteria.getCriteriaMap()
                                .entrySet()
                                .stream()
                                .allMatch(entry -> ApplianceMatcherFactory.getMatcher(node.getNodeName()).isMatchesCriteria(appliance, entry.getKey(), entry.getValue()))) {
                            appliances.add(appliance);
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new DaoException(e);
        }
        return appliances;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean add(String applianceName, Appliance appliance) throws DaoException {
        try {
            Document document = getDocument(ResourceConst.APPLIANCES_DB_XML);
            Element root = document.getDocumentElement();

            root.appendChild(ApplianceXMLFactory.getApplianceXMLFactory(applianceName).createApplianceXML(document, appliance));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            Source source = new DOMSource(document);
            StreamResult result = new StreamResult(Objects.requireNonNull(getClass().getClassLoader().getResource(ResourceConst.APPLIANCES_DB_XML)).getFile());
            transformer.transform(source, result);
        } catch (TransformerException e) {
            throw new DaoException(e);
        }
        return true;
    }

    /**
     * Reads the information from xml file (the name of this file
     * is ResourceConstant.APPLIANCES_DB_XML, it is in the resource folder).
     *
     * @param fileName name of XML-file
     * @return Document
     * @throws DaoException when throwing an exception on a dao layer
     */
    private Document getDocument(String fileName) throws DaoException {
        Document document;
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            document = documentBuilder.parse(Objects.requireNonNull(getClass().getClassLoader().getResource(fileName)).getFile());
            document.getDocumentElement().normalize();
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new DaoException(e);
        }
        return document;
    }

}