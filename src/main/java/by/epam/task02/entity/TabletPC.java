package by.epam.task02.entity;

import by.epam.task02.constant.SearchCriteriaFieldConstant;
import by.epam.task02.constant.ApplianceNameConstant;

import java.io.Serializable;
import java.util.Objects;

public class TabletPC extends Appliance implements Serializable {
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private Color color;

    public TabletPC() {
    }

    public TabletPC(double price, double batteryCapacity, double displayInches, double memoryRom, double flashMemoryCapacity, Color color) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public boolean isMatchesCriteria(String criteriaName, Object value) {
        return switch (criteriaName) {
            case SearchCriteriaFieldConstant.PRICE,
                    SearchCriteriaFieldConstant.MORE_THAN_CURRENT_PRICE,
                    SearchCriteriaFieldConstant.LESS_THAN_CURRENT_PRICE,
                    SearchCriteriaFieldConstant.EQUAL_CURRENT_PRICE -> super.isMatchesCriteria(criteriaName, value);
            case SearchCriteriaFieldConstant.APPLIANCE_NAME -> ApplianceNameConstant.TABLET_PC.equals(value);
            case SearchCriteriaFieldConstant.BATTERY_CAPACITY -> (double) value == batteryCapacity;
            case SearchCriteriaFieldConstant.DISPLAY_INCHES -> (double) value == displayInches;
            case SearchCriteriaFieldConstant.MEMORY_ROM -> (double) value == memoryRom;
            case SearchCriteriaFieldConstant.FLASH_MEMORY_CAPACITY -> (double) value == flashMemoryCapacity;
            case SearchCriteriaFieldConstant.COLOR -> color.equals(Color.valueOf((String) value));
            default -> false;
        };
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 && Double.compare(tabletPC.displayInches, displayInches) == 0 && memoryRom == tabletPC.memoryRom && flashMemoryCapacity == tabletPC.flashMemoryCapacity && color == tabletPC.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "price=" + super.getPrice() +
                ", batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color=" + color +
                '}';
    }
}
