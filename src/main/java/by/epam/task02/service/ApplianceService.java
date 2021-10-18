package by.epam.task02.service;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.exception.DaoException;
import by.epam.task02.exception.ServiceException;

import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria) throws DaoException, ServiceException;

}
