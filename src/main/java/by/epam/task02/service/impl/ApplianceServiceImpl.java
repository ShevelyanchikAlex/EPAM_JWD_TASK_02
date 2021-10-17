package by.epam.task02.service.impl;

import by.epam.task02.dao.ApplianceDAO;
import by.epam.task02.dao.DAOFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.service.ApplianceService;
import by.epam.task02.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!Validator.isCriteriaValid(criteria)) {
            return null;
            //add trows...
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        return applianceDAO.find(criteria);
    }

}
