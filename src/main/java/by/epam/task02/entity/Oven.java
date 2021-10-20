package by.epam.task02.entity;

import by.epam.task02.constant.SearchCriteriaFieldConstant;
import by.epam.task02.constant.ApplianceNameConstant;

import java.io.Serializable;
import java.util.Objects;

/**
 * Oven class with properties <b>price</b>, <b>powerConsumption</b>,
 * <b>weight</b>, <b>capacity</b>, <b>depth</b>, <b>height</b>, <b>width</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Oven extends Appliance implements Serializable {
    /**
     * Field powerConsumption of oven
     */
    private double powerConsumption;
    /**
     * Field weight of oven
     */
    private double weight;
    /**
     * Field capacity of oven
     */
    private double capacity;
    /**
     * Field depth of oven
     */
    private double depth;
    /**
     * Field height of oven
     */
    private double height;
    /**
     * Field width of oven
     */
    private double width;

    /**
     * Parameterless Oven constructor - creating a new Oven object
     */
    public Oven() {
    }

    /**
     * Oven constructor - creating a new Oven object with parameters
     *
     * @param price            - price
     * @param powerConsumption - power consumption
     * @param weight           - weight
     * @param capacity         - capacity
     * @param depth            - depth
     * @param height           - height
     * @param width            - width
     */
    public Oven(double price, double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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
            case SearchCriteriaFieldConstant.APPLIANCE_NAME -> ApplianceNameConstant.OVEN.equals(value);
            case SearchCriteriaFieldConstant.POWER_CONSUMPTION -> (double) value == powerConsumption;
            case SearchCriteriaFieldConstant.WEIGHT -> (double) value == weight;
            case SearchCriteriaFieldConstant.CAPACITY -> (double) value == capacity;
            case SearchCriteriaFieldConstant.DEPTH -> (double) value == depth;
            case SearchCriteriaFieldConstant.HEIGHT -> (double) value == height;
            case SearchCriteriaFieldConstant.WIDTH -> (double) value == width;
            default -> false;
        };
    }


    /**
     * Function to get powerConsumption value
     *
     * @return powerConsumption
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Function to get weight value
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Function to get capacity value
     *
     * @return capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Function to get depth value
     *
     * @return depth
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Function to get height value
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Function to get width value
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
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption && Double.compare(oven.weight, weight) == 0 && capacity == oven.capacity && Double.compare(oven.depth, depth) == 0 && Double.compare(oven.height, height) == 0 && Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "price=" + super.getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
