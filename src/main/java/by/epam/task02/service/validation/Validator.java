package by.epam.task02.service.validation;

import by.epam.task02.entity.criteria.Criteria;

public class Validator {

    public static boolean isCriteriaValid(Criteria criteria) {
        if (criteria == null) {
            return false;
        }

        return criteria.getCriteriaMap().entrySet().stream().allMatch(
                entry -> CriteriaValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValid(entry.getValue()));
    }

}