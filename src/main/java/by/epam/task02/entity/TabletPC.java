package by.epam.task02.entity;

import by.epam.task02.constant.ApplianceFieldConstant;

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
            case ApplianceFieldConstant.BATTERY_CAPACITY -> (double) value == batteryCapacity;
            case ApplianceFieldConstant.DISPLAY_INCHES -> (double) value == displayInches;
            case ApplianceFieldConstant.MEMORY_ROM -> (double) value == memoryRom;
            case ApplianceFieldConstant.FLASH_MEMORY_CAPACITY -> (double) value == flashMemoryCapacity;
            case ApplianceFieldConstant.COLOR -> Color.valueOf((String) value) == color;
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
