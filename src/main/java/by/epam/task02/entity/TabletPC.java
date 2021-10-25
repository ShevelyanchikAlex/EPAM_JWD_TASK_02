package by.epam.task02.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * TabletPC class with properties <b>price</b>, <b>batteryCapacity</b>,
 * <b>displayInches</b>, <b>memoryRom</b>, <b>flashMemoryCapacity</b>, <b>color</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class TabletPC extends Appliance implements Serializable {
    /**
     * Field batteryCapacity of tabletPC
     */
    private double batteryCapacity;
    /**
     * Field displayInches of tabletPC
     */
    private double displayInches;
    /**
     * Field memoryRom of tabletPC
     */
    private double memoryRom;
    /**
     * Field flashMemoryCapacity of tabletPC
     */
    private double flashMemoryCapacity;
    /**
     * Field color of tabletPC
     */
    private Color color;

    /**
     * Parameterless TabletPC constructor - creating a new TabletPC object
     */
    public TabletPC() {
    }

    /**
     * TabletPC constructor - creating a new TabletPC object with parameters
     *
     * @param price               price
     * @param batteryCapacity     battery capacity
     * @param displayInches       display inches
     * @param memoryRom           memory rom
     * @param flashMemoryCapacity flash memory capacity
     * @param color               color
     */
    public TabletPC(double price, double batteryCapacity, double displayInches, double memoryRom, double flashMemoryCapacity, Color color) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    /**
     * Gets batteryCapacity value
     *
     * @return batteryCapacity
     */
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Gets displayInches value
     *
     * @return displayInches
     */
    public double getDisplayInches() {
        return displayInches;
    }

    /**
     * Gets memoryRom value
     *
     * @return memoryRom
     */
    public double getMemoryRom() {
        return memoryRom;
    }

    /**
     * Gets flashMemoryCapacity value
     *
     * @return flashMemoryCapacity
     */
    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    /**
     * Gets color value
     *
     * @return color
     */
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
