package by.epam.task02.service;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.dao.DaoException;

import java.util.List;

/**
 * ApplianceService interface of an ApplianceService class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public interface ApplianceService {

    /**
     * Validates {@link by.epam.task02.entity.criteria.SearchCriteria} and finds all {@link Appliance} that match the given search criteria.
     *
     * @param criteria {@link by.epam.task02.entity.criteria.SearchCriteria} with which sorting occurs
     * @return {@link List<Appliance>}  list of {@link Appliance} found
     * @throws DaoException     when throwing an exception on a DAO layer
     * @throws ServiceException when throwing an exception on a Service layer
     */
    List<Appliance> find(Criteria criteria) throws DaoException, ServiceException;


    /**
     * Adds {@link Appliance} to xml-file.
     *
     * @param applianceName name of {@link Appliance}
     * @param appliance     {@link Appliance}
     * @return true when added without exception, otherwise false
     * @throws DaoException     when throwing an exception on a DAO layer
     * @throws ServiceException when throwing an exception on a Service layer
     */
    boolean add(String applianceName, Appliance appliance) throws DaoException, ServiceException;

}
