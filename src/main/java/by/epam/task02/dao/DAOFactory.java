package by.epam.task02.dao;

import by.epam.task02.dao.impl.ApplianceDAOImpl;

/**
 * DAOFactory class with properties <b>instance</b> and <b>applianceDAO</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public final class DAOFactory {
    /**
     * Field instance - instance of DAOFactory
     */
    private static final DAOFactory instance = new DAOFactory();
    /**
     * Field applianceDAO - ApplianceDAOImpl
     */
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    /**
     * Private constructor to close the ability of instantiating DAOFactory.
     */
    private DAOFactory() {
    }

    /**
     * Gets applianceDAO
     *
     * @return applianceDAO
     */
    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    /**
     * Gets instance of DAOFactory
     *
     * @return instance
     */
    public static DAOFactory getInstance() {
        return instance;
    }
}
