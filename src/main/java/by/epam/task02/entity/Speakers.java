package by.epam.task02.entity;

import by.epam.task02.constant.SearchCriteriaFieldConstant;
import by.epam.task02.constant.ApplianceNameConstant;

import java.io.Serializable;
import java.util.Objects;

public class Speakers extends Appliance implements Serializable {
    private double powerConsumption;
    private int numberOfSpeakers;
    private double cordLength;


    public Speakers() {
    }

    public Speakers(double price, double powerConsumption, int numberOfSpeakers, double cordLength) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
    }

    public boolean isMatchesCriteria(String criteriaName, Object value) {
        return switch (criteriaName) {
            case SearchCriteriaFieldConstant.PRICE,
                    SearchCriteriaFieldConstant.MORE_THAN_CURRENT_PRICE,
                    SearchCriteriaFieldConstant.LESS_THAN_CURRENT_PRICE,
                    SearchCriteriaFieldConstant.EQUAL_CURRENT_PRICE -> super.isMatchesCriteria(criteriaName, value);
            case SearchCriteriaFieldConstant.APPLIANCE_NAME -> ApplianceNameConstant.SPEAKERS.equals(value);
            case SearchCriteriaFieldConstant.POWER_CONSUMPTION -> (double) value == powerConsumption;
            case SearchCriteriaFieldConstant.NUMBER_OF_SPEAKERS -> (int) value == numberOfSpeakers;
            case SearchCriteriaFieldConstant.CORD_LENGTH -> (double) value == cordLength;
            default -> false;
        };
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public double getCordLength() {
        return cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0 && numberOfSpeakers == speakers.numberOfSpeakers && Double.compare(speakers.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", cordLength=" + cordLength +
                '}';
    }
}
