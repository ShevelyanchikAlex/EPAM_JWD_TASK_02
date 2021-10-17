package by.epam.task02.dao;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria);
}
