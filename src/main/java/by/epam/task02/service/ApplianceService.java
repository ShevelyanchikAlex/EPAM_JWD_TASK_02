package by.epam.task02.service;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.exception.DaoException;
import by.epam.task02.exception.ServiceException;

import java.util.List;

/**
 * ApplianceService interface of an ApplianceService class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public interface ApplianceService {

    /**
     * Validates search criteria and finds all appliances that match the given search criteria.
     *
     * @param criteria SearchCriteria with which sorting occurs
     * @return List<Appliance>  list of appliances found
     * @throws DaoException     when throwing an exception on a dao layer
     * @throws ServiceException when throwing an exception on a service layer
     */
    List<Appliance> find(Criteria criteria) throws DaoException, ServiceException;


    /**
     * Adds Appliance to xml-file.
     *
     * @param applianceName name of appliance
     * @param appliance     appliance
     * @return true when added without exception, otherwise false
     * @throws DaoException     when throwing an exception on a dao layer
     * @throws ServiceException when throwing an exception on a service layer
     */
    boolean add(String applianceName, Appliance appliance) throws DaoException, ServiceException;

}
