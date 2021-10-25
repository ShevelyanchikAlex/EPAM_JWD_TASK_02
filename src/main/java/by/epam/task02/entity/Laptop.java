package by.epam.task02.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Laptop class with properties <b>price</b>, <b>batteryCapacity</b>,
 * <b>os</b>, <b>memoryRom</b>, <b>cpu</b>, <b>displayInches</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Laptop extends Appliance implements Serializable {
    /**
     * Field batteryCapacity of laptop
     */
    private double batteryCapacity;
    /**
     * Field os of laptop
     */
    private OS os;
    /**
     * Field memoryRom of laptop
     */
    private double memoryRom;
    /**
     * Field cpu of laptop
     */
    private CPU cpu;
    /**
     * Field displayInches of laptop
     */
    private double displayInches;

    /**
     * Parameterless Laptop constructor - creating a new Laptop object
     */
    public Laptop() {
    }

    /**
     * Laptop constructor - creating a new Laptop object with parameters
     *
     * @param price            price
     * @param battery_capacity battery capacity
     * @param os               operating system
     * @param memory_rom       memory rom
     * @param cpu              cpu
     * @param displayInches    display inches
     */
    public Laptop(double price, double battery_capacity, OS os, double memory_rom, CPU cpu, double displayInches) {
        super(price);
        this.batteryCapacity = battery_capacity;
        this.os = os;
        this.memoryRom = memory_rom;
        this.cpu = cpu;
        this.displayInches = displayInches;
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
     * Gets OS value
     *
     * @return os
     */
    public OS getOs() {
        return os;
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
     * Gets cpu value
     *
     * @return cpu
     */
    public CPU getCpu() {
        return cpu;
    }

    /**
     * Gets displayInches value
     *
     * @return displayInches
     */
    public double getDisplayInches() {
        return displayInches;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryCapacity == laptop.batteryCapacity && memoryRom == laptop.memoryRom && Double.compare(laptop.displayInches, displayInches) == 0 && os == laptop.os && cpu == laptop.cpu;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, os, memoryRom, cpu, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + super.getPrice() +
                ", batteryCapacity=" + batteryCapacity +
                ", os=" + os +
                ", memoryRom=" + memoryRom +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}
