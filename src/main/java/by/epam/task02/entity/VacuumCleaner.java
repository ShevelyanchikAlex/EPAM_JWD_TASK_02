package by.epam.task02.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * VacuumCleaner class with properties <b>price</b>, <b>powerConsumption</b>,
 * <b>filterType</b>, <b>bagType</b>, <b>wandType</b>, <b>motorSpeedRegulation</b>,
 * <b>cleaningWidth</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class VacuumCleaner extends Appliance implements Serializable {
    /**
     * Field powerConsumption of vacuumCleaner
     */
    private double powerConsumption;
    /**
     * Field filterType of vacuumCleaner
     */
    private FilterType filterType;
    /**
     * Field bagType of vacuumCleaner
     */
    private BagType bagType;
    /**
     * Field wandType of vacuumCleaner
     */
    private WandType wandType;
    /**
     * Field motorSpeedRegulation of vacuumCleaner
     */
    private double motorSpeedRegulation;
    /**
     * Field cleaningWidth of laptop
     */
    private double cleaningWidth;

    /**
     * Parameterless VacuumCleaner constructor - creating a new VacuumCleaner object
     */
    public VacuumCleaner() {
    }

    /**
     * VacuumCleaner constructor - creating a new VacuumCleaner object with parameters
     *
     * @param price                price
     * @param powerConsumption     power consumption
     * @param filterType           filter type
     * @param bagType              bag type
     * @param wandType             wand type
     * @param motorSpeedRegulation motor speed regulation
     * @param cleaningWidth        cleaning width
     */
    public VacuumCleaner(double price, double powerConsumption, FilterType filterType, BagType bagType, WandType wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
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
     * Gets filterType value
     *
     * @return filterType
     */
    public FilterType getFilterType() {
        return filterType;
    }

    /**
     * Gets bagType value
     *
     * @return bagType
     */
    public BagType getBagType() {
        return bagType;
    }

    /**
     * Gets wandType value
     *
     * @return wandType
     */
    public WandType getWandType() {
        return wandType;
    }

    /**
     * Gets motorSpeedRegulation value
     *
     * @return motorSpeedRegulation
     */
    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    /**
     * Gets cleaningWidth value
     *
     * @return cleaningWidth
     */
    public double getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption && Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0 && Double.compare(that.cleaningWidth, cleaningWidth) == 0 && filterType == that.filterType && bagType == that.bagType && wandType == that.wandType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "price=" + super.getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType=" + bagType +
                ", wandType=" + wandType +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
