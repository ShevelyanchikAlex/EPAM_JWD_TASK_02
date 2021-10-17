package by.epam.task02.dao.impl;

import by.epam.task02.dao.ApplianceDAO;
import by.epam.task02.dao.appliance_factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
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

public class ApplianceDAOImpl implements ApplianceDAO {

    private static final String APPLIANCES_DB_XML = "appliances_db.xml";

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> appliances = new ArrayList<>();
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(Objects.requireNonNull(getClass().getResource(APPLIANCES_DB_XML)).getFile());
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getDocumentElement().getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    ApplianceFactory applianceFactory = ApplianceFactory.getApplianceFactory(node.getNodeName());
                    Appliance appliance = applianceFactory.createAppliance(node.getChildNodes());

                }
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
            return null;
        }
        return appliances;
    }


}