package by.epam.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * Criteria class with properties <b>criteriaMap</b>, <b>groupSearchName</b>.
 * Contains a criteriaMap of SearchCriteria for further filtering using it.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Criteria {
    /**
     * Field criteriaMap contains SearchCriteria for further filtering
     */
    private final Map<String, Object> criteriaMap = new HashMap<>();
    /**
     * Field groupSearchName
     */
    private final String groupSearchName;

    /**
     * Criteria constructor - creating a new Criteria object with parameters
     *
     * @param groupSearchName - group search name
     */
    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    /**
     * Function to get groupSearchName
     *
     * @return groupSearchName
     */
    public String getGroupSearchName() {
        return groupSearchName;
    }

    /**
     * Function to get criteriaMap
     *
     * @return criteriaMap
     */
    public Map<String, Object> getCriteriaMap() {
        return criteriaMap;
    }

    /**
     * Function to add new SearchCriteria with value to criteriaMap
     */
    public void add(String searchCriteria, Object value) {
        criteriaMap.put(searchCriteria, value);
    }
}
