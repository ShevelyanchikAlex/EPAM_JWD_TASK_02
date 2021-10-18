package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceFieldConstant;

import java.util.Objects;

public class Speakers extends Appliance {
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
            case ApplianceFieldConstant.POWER_CONSUMPTION -> (double) value == powerConsumption;
            case ApplianceFieldConstant.NUMBER_OF_SPEAKERS -> (int) value == numberOfSpeakers;
            case ApplianceFieldConstant.CORD_LENGTH -> (double) value == cordLength;
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
