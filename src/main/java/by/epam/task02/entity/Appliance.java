package by.epam.task02.entity;

import by.epam.task02.constant.SearchCriteriaFieldConstant;

import java.io.Serializable;
import java.util.Objects;


public class Appliance implements Serializable {

    private double price;

    public Appliance() {
    }

    public Appliance(double price) {
        this.price = price;
    }

    public boolean isMatchesCriteria(String criteriaName, Object value) {
        return switch (criteriaName) {
            case SearchCriteriaFieldConstant.MORE_THAN_CURRENT_PRICE -> price > (double) value;
            case SearchCriteriaFieldConstant.LESS_THAN_CURRENT_PRICE -> price < (double) value;
            case SearchCriteriaFieldConstant.PRICE,
                    SearchCriteriaFieldConstant.EQUAL_CURRENT_PRICE -> price == (double) value;
            default -> false;
        };
    }

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
