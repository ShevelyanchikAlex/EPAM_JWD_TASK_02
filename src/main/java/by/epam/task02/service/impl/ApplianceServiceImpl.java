package by.epam.task02.service.impl;

import by.epam.task02.dao.ApplianceDAO;
import by.epam.task02.dao.DAOFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.dao.DaoException;
import by.epam.task02.service.ServiceException;
import by.epam.task02.service.ApplianceService;
import by.epam.task02.service.constant.ServiceExceptionMessage;
import by.epam.task02.service.validation.Validator;

import java.util.List;

/**
 * ApplianceServiceImpl class.
 * Implements {@link ApplianceService} and works with {@link by.epam.task02.dao.impl.ApplianceDAOImpl}.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.isCriteriaValid(criteria)) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(criteria);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public boolean add(String applianceName, Appliance appliance) throws DaoException, ServiceException {
        if (applianceName.isEmpty() || appliance == null) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        boolean isApplianceAdded;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            isApplianceAdded = applianceDAO.add(applianceName, appliance);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        return isApplianceAdded;
    }

}
