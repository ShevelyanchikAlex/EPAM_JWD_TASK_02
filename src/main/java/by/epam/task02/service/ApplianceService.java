package by.epam.task02.service;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria);

}
