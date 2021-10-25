package by.epam.task02.constant;

/**
 * SearchCriteriaFieldConst enum with constants <b>APPLIANCE_NAME</b>,
 * <b>PRICE</b>, <b>MORE_THAN_CURRENT_PRICE</b>, <b>LESS_THAN_CURRENT_PRICE</b>,
 * <b>EQUAL_CURRENT_PRICE</b>, <b>BATTERY_CAPACITY</b>, <b>OS</b>, <b>MEMORY_ROM</b>,
 * <b>CPU</b>,<b>DISPLAY_INCHES</b>, <b>POWER_CONSUMPTION</b>, <b>WEIGHT</b>, <b>HEIGHT</b>,
 * <b>WIDTH</b>, <b>CAPACITY</b>,<b>DEPTH</b>, <b>FREEZER_CAPACITY</b>,<b>OVERALL_CAPACITY</b>,
 * <b>NUMBER_OF_SPEAKERS</b>,<b>CORD_LENGTH</b>, <b>FLASH_MEMORY_CAPACITY</b>,<b>COLOR</b>,
 * <b>FILTER_TYPE</b>,<b>BAG_TYPE</b>, <b>WAND_TYPE</b>, <b>MOTOR_SPEED_REGULATION</b>, <b>CLEANING_WIDTH</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public enum SearchCriteriaFieldConst {
    APPLIANCE_NAME,

    PRICE,
    MORE_THAN_CURRENT_PRICE,
    LESS_THAN_CURRENT_PRICE,
    EQUAL_CURRENT_PRICE,

    BATTERY_CAPACITY,
    OS,
    MEMORY_ROM,
    CPU,
    DISPLAY_INCHES,

    POWER_CONSUMPTION,
    WEIGHT,
    HEIGHT,
    WIDTH,

    CAPACITY,
    DEPTH,

    FREEZER_CAPACITY,
    OVERALL_CAPACITY,

    NUMBER_OF_SPEAKERS,
    CORD_LENGTH,

    FLASH_MEMORY_CAPACITY,
    COLOR,

    FILTER_TYPE,
    BAG_TYPE,
    WAND_TYPE,
    MOTOR_SPEED_REGULATION,
    CLEANING_WIDTH;

    /**
     * Private constructor to close the ability of instantiating SearchCriteriaFieldConst.
     */
    private SearchCriteriaFieldConst() {
    }
}
