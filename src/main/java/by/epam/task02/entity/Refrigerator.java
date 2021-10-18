package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceFieldConstant;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends Appliance implements Serializable {
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator() {
    }

    public Refrigerator(double price, double powerConsumOption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
        super(price);
        this.powerConsumption = powerConsumOption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public boolean isMatchesCriteria(String criteriaName, Object value) {
        return switch (criteriaName) {
            case ApplianceFieldConstant.POWER_CONSUMPTION -> (double) value == powerConsumption;
            case ApplianceFieldConstant.WEIGHT -> (double) value == weight;
            case ApplianceFieldConstant.FREEZER_CAPACITY -> (double) value == freezerCapacity;
            case ApplianceFieldConstant.OVERALL_CAPACITY -> (double) value == overallCapacity;
            case ApplianceFieldConstant.HEIGHT -> (double) value == height;
            case ApplianceFieldConstant.WIDTH -> (double) value == width;
            default -> false;
        };
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
