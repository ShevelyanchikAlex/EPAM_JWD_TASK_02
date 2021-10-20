package by.epam.task02.dao;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.exception.DaoException;

import java.util.List;

/**
 * ApplianceDAO interface of an applianceDao class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public interface ApplianceDAO {
    /**
     * Finds all appliances that match the given criteria.
     *
     * @param criteria - SearchCriteria with which sorting occurs
     * @return List<Appliance> - list of appliances found
     * @throws DaoException - DaoException when throwing an exception on a dao layer
     */
    List<Appliance> find(Criteria criteria) throws DaoException;
}
