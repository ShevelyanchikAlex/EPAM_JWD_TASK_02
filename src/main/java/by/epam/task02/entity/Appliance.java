package by.epam.task02.entity;

import by.epam.task02.constant.SearchCriteriaFieldConstant;

import java.io.Serializable;
import java.util.Objects;

/**
 * Appliance class with property <b>price</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Appliance implements Serializable {

    /**
     * Field price - price of appliance
     */
    private double price;

    /**
     * Parameterless Appliance constructor - creating a new Appliance object
     */
    public Appliance() {
    }

    /**
     * Appliance constructor - creating a new Appliance object with a parameter
     *
     * @param price - price
     */
    public Appliance(double price) {
        this.price = price;
    }

    /**
     * Criterion match method.
     * For inheritors of the Appliance class this method should be overridden.
     *
     * @param criteriaName - name of criteria
     * @param value        - value to compare by criteria
     * @return true if appliance matches the given criteriaName and value. Otherwise, it returns false.
     */
    public boolean isMatchesCriteria(String criteriaName, Object value) {
        return switch (criteriaName) {
            case SearchCriteriaFieldConstant.MORE_THAN_CURRENT_PRICE -> price > (double) value;
            case SearchCriteriaFieldConstant.LESS_THAN_CURRENT_PRICE -> price < (double) value;
            case SearchCriteriaFieldConstant.PRICE,
                    SearchCriteriaFieldConstant.EQUAL_CURRENT_PRICE -> price == (double) value;
            default -> false;
        };
    }

    /**
     * Gets price value
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "price=" + price +
                '}';
    }
}
