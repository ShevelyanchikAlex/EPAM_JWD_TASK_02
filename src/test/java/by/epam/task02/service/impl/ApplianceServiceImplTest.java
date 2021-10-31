package by.epam.task02.service.impl;

import by.epam.task02.dao.DaoException;
import by.epam.task02.dao.constant.ApplianceTagName;
import by.epam.task02.entity.*;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.entity.criteria.SearchCriteria;
import by.epam.task02.service.ApplianceService;
import by.epam.task02.service.ServiceException;
import by.epam.task02.service.ServiceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ApplianceServiceImplTest class.
 * Unit testing the Service layer methods.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ApplianceServiceImplTest {

    @Test
    public void find() {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        List<Appliance> appliances = new ArrayList<>();
        Appliance expectedAppliance = new Oven(200.0, 1500.0, 12.0, 33.0, 60.0, 45.0, 60.0);

        Criteria criteriaOven = new Criteria(ApplianceTagName.OVEN.name());
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.name(), 45.0);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.name(), 60.0);
        criteriaOven.add(SearchCriteria.Oven.POWER_CONSUMPTION.name(), 1500.0);

        try {
            appliances = service.find(criteriaOven);
        } catch (ServiceException | DaoException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(expectedAppliance, appliances.get(0));
    }

    @Test
    public void add() {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        boolean isAdded = false;
        try {
            isAdded = service.add(ApplianceTagName.LAPTOP.name(), new Laptop(1000.0, 1000.0, OS.LINUX, 100.0, CPU.AMD_RYZEN_5_5600X, 13.6));
        } catch (DaoException | ServiceException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(isAdded);
    }
}