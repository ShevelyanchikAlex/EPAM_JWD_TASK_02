package by.epam.task02.entity;

import by.epam.task02.constant.SearchCriteriaFieldConstant;
import by.epam.task02.constant.ApplianceNameConstant;

import java.io.Serializable;
import java.util.Objects;

/**
 * Speakers class with properties <b>price</b>, <b>powerConsumption</b>,
 * <b>numberOfSpeakers</b>, <b>cordLength</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Speakers extends Appliance implements Serializable {
    /**
     * Field powerConsumption of speakers
     */
    private double powerConsumption;
    /**
     * Field numberOfSpeakers of speakers
     */
    private int numberOfSpeakers;
    /**
     * Field cordLength of speakers
     */
    private double cordLength;


    /**
     * Parameterless Speakers constructor - creating a new Speakers object
     */
    public Speakers() {
    }

    /**
     * Speakers constructor - creating a new Speakers object with parameters
     *
     * @param price            - price
     * @param powerConsumption - power consumption
     * @param numberOfSpeakers - number of speakers
     * @param cordLength       - cord length
     */
    public Speakers(double price, double powerConsumption, int numberOfSpeakers, double cordLength) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
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
            case SearchCriteriaFieldConstant.APPLIANCE_NAME -> ApplianceNameConstant.SPEAKERS.equals(value);
            case SearchCriteriaFieldConstant.POWER_CONSUMPTION -> (double) value == powerConsumption;
            case SearchCriteriaFieldConstant.NUMBER_OF_SPEAKERS -> (int) value == numberOfSpeakers;
            case SearchCriteriaFieldConstant.CORD_LENGTH -> (double) value == cordLength;
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
     * Gets numberOfSpeakers value
     *
     * @return numberOfSpeakers
     */
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * Gets cordLength value
     *
     * @return cordLength
     */
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
