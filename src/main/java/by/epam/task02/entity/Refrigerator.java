package by.epam.task02.entity;

import by.epam.task02.constant.SearchCriteriaFieldConstant;
import by.epam.task02.constant.ApplianceNameConstant;

import java.io.Serializable;
import java.util.Objects;

/**
 * Refrigerator class with properties <b>price</b>, <b>powerConsumption</b>,
 * <b>weight</b>, <b>freezerCapacity</b>, <b>overallCapacity</b>, <b>height</b>,
 * <b>width</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Refrigerator extends Appliance implements Serializable {
    /**
     * Field powerConsumption of refrigerator
     */
    private double powerConsumption;
    /**
     * Field weight of refrigerator
     */
    private double weight;
    /**
     * Field freezerCapacity of refrigerator
     */
    private double freezerCapacity;
    /**
     * Field overallCapacity of refrigerator
     */
    private double overallCapacity;
    /**
     * Field height of refrigerator
     */
    private double height;
    /**
     * Field width of refrigerator
     */
    private double width;

    /**
     * Parameterless Refrigerator constructor - creating a new Refrigerator object
     */
    public Refrigerator() {
    }

    /**
     * Refrigerator constructor - creating a new Refrigerator object with parameters
     *
     * @param price            - price
     * @param powerConsumption - power consumption
     * @param weight           - weight
     * @param freezerCapacity  - freezer capacity
     * @param overallCapacity  - overall capacity
     * @param height           - height
     * @param width            - width
     */
    public Refrigerator(double price, double powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(String criteriaName, Object value) {
        return switch (criteriaName) {
            case SearchCriteriaFieldConstant.PRICE,
                    SearchCriteriaFieldConstant.MORE_THAN_CURRENT_PRICE,
                    SearchCriteriaFieldConstant.LESS_THAN_CURRENT_PRICE,
                    SearchCriteriaFieldConstant.EQUAL_CURRENT_PRICE -> super.isMatchesCriteria(criteriaName, value);
            case SearchCriteriaFieldConstant.APPLIANCE_NAME -> ApplianceNameConstant.REFRIGERATOR.equals(value);
            case SearchCriteriaFieldConstant.POWER_CONSUMPTION -> (double) value == powerConsumption;
            case SearchCriteriaFieldConstant.WEIGHT -> (double) value == weight;
            case SearchCriteriaFieldConstant.FREEZER_CAPACITY -> (double) value == freezerCapacity;
            case SearchCriteriaFieldConstant.OVERALL_CAPACITY -> (double) value == overallCapacity;
            case SearchCriteriaFieldConstant.HEIGHT -> (double) value == height;
            case SearchCriteriaFieldConstant.WIDTH -> (double) value == width;
            default -> false;
        };
    }

    /**
     * Gets powerConsumption value
     *
     * @return powerConsumption
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Gets weight value
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Gets freezerCapacity value
     *
     * @return freezerCapacity
     */
    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    /**
     * Gets overallCapacity value
     *
     * @return overallCapacity
     */
    public double getOverallCapacity() {
        return overallCapacity;
    }

    /**
     * Gets height value
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets width value
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 && Double.compare(that.weight, weight) == 0 && Double.compare(that.freezerCapacity, freezerCapacity) == 0 && Double.compare(that.overallCapacity, overallCapacity) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "price=" + super.getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
