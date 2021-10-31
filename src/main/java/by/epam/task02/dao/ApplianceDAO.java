package by.epam.task02.dao;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;

import java.util.List;

/**
 * ApplianceDAO interface of an applianceDao class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public interface ApplianceDAO {
    /**
     * Finds all {@link Appliance} that match the given criteria.
     *
     * @param criteria {@link by.epam.task02.entity.criteria.SearchCriteria} with which sorting occurs
     * @return {@link List<Appliance>}  list of appliances found
     * @throws DaoException when throwing an exception on a DAO layer
     */
    List<Appliance> find(Criteria criteria) throws DaoException;

    /**
     * Adds {@link Appliance} to xml-file.
     *
     * @param applianceName name of {@link Appliance}
     * @param appliance     {@link Appliance}
     * @return true when added without exception, otherwise false
     * @throws DaoException when throwing an exception on a DAO layer
     */
    boolean add(String applianceName, Appliance appliance) throws DaoException;
}
