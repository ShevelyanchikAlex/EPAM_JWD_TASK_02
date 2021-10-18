package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceFieldConstant;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends Appliance implements Serializable {
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
    }

    public Oven(double price, double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }


    public boolean isMatchesCriteria(String criteriaName, Object value) {
        return switch (criteriaName) {
            case ApplianceFieldConstant.POWER_CONSUMPTION -> (double) value == powerConsumption;
            case ApplianceFieldConstant.WEIGHT -> (double) value == weight;
            case ApplianceFieldConstant.CAPACITY -> (double) value == capacity;
            case ApplianceFieldConstant.DEPTH -> (double) value == depth;
            case ApplianceFieldConstant.HEIGHT -> (double) value == height;
            case ApplianceFieldConstant.WIDTH -> (double) value == width;
            default -> false;
        };
    }


    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

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
