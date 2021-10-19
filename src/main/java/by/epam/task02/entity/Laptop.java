package by.epam.task02.entity;

import by.epam.task02.constant.SearchCriteriaFieldConstant;
import by.epam.task02.constant.ApplianceNameConstant;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends Appliance implements Serializable {
    private double batteryCapacity;
    private OS os;
    private double memoryRom;
    private CPU cpu;
    private double displayInches;


    public Laptop() {
    }


    public Laptop(double price, double battery_capacity, OS os, double memory_rom, CPU cpu, double displayInchs) {
        super(price);
        this.batteryCapacity = battery_capacity;
        this.os = os;
        this.memoryRom = memory_rom;
        this.cpu = cpu;
        this.displayInches = displayInchs;
    }


    public boolean isMatchesCriteria(String criteriaName, Object value) {
        return switch (criteriaName) {
            case SearchCriteriaFieldConstant.PRICE,
                    SearchCriteriaFieldConstant.MORE_THAN_CURRENT_PRICE,
                    SearchCriteriaFieldConstant.LESS_THAN_CURRENT_PRICE,
                    SearchCriteriaFieldConstant.EQUAL_CURRENT_PRICE -> super.isMatchesCriteria(criteriaName, value);
            case SearchCriteriaFieldConstant.APPLIANCE_NAME -> ApplianceNameConstant.LAPTOP.equals(value);
            case SearchCriteriaFieldConstant.BATTERY_CAPACITY -> (double) value == batteryCapacity;
            case SearchCriteriaFieldConstant.OS -> os.equals(OS.valueOf((String) value));
            case SearchCriteriaFieldConstant.MEMORY_ROM -> (double) value == memoryRom;
            case SearchCriteriaFieldConstant.CPU -> cpu.equals(CPU.valueOf((String) value));
            case SearchCriteriaFieldConstant.DISPLAY_INCHES -> (double) value == displayInches;
            default -> false;
        };
    }


    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public OS getOs() {
        return os;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public CPU getCpu() {
        return cpu;
    }

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
