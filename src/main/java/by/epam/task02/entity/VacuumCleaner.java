package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceFieldConstant;

import java.io.Serializable;
import java.util.Objects;

public class VacuumCleaner extends Appliance implements Serializable {
    private double powerConsumption;
    private FilterType filterType;
    private BagType bagType;
    private WandType wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(double price, double powerConsumption, FilterType filterType, BagType bagType, WandType wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public boolean isMatchesCriteria(String criteriaName, Object value) {
        return switch (criteriaName) {
            case ApplianceFieldConstant.POWER_CONSUMPTION -> (double) value == powerConsumption;
            case ApplianceFieldConstant.FILTER_TYPE -> FilterType.valueOf((String) value) == filterType;
            case ApplianceFieldConstant.BAG_TYPE -> BagType.valueOf((String) value) == bagType;
            case ApplianceFieldConstant.WAND_TYPE -> WandType.valueOf((String) value) == wandType;
            case ApplianceFieldConstant.MOTOR_SPEED_REGULATION -> (double) value == motorSpeedRegulation;
            case ApplianceFieldConstant.CLEANING_WIDTH -> (double) value == cleaningWidth;
            default -> false;
        };
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public BagType getBagType() {
        return bagType;
    }

    public WandType getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

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
