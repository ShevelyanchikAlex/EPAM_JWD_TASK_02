package by.epam.task02.entity.criteria;

public final class SearchCriteria {

    public enum Oven {
        PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    public enum Laptop {
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }

    public enum Refrigerator {
        PRICE, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    public enum VacuumCleaner {
        PRICE, POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    public enum TabletPC {
        PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    public enum Speakers {
        PRICE, POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, CORD_LENGTH
    }

    private SearchCriteria() {
    }
}

