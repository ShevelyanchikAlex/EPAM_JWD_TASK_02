package by.epam.task02.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Appliance class with property <b>price</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Appliance implements Serializable {

    /**
     * Field price - price of appliance
     */
    private double price;

    /**
     * Parameterless Appliance constructor - creating a new Appliance object
     */
    public Appliance() {
    }

    /**
     * Appliance constructor - creating a new Appliance object with a parameter
     *
     * @param price price
     */
    public Appliance(double price) {
        this.price = price;
    }

    /**
     * Gets price value
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "price=" + price +
                '}';
    }
}
