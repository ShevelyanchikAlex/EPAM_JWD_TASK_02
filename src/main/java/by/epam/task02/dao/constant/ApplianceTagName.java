package by.epam.task02.dao.constant;

import by.epam.task02.dao.DaoException;

/**
 * ApplianceNameConstant enum with constants <b>LAPTOP</b>, <b>OVEN</b>,
 * <b>REFRIGERATOR</b>, <b>SPEAKERS</b>, <b>TABLET_PC</b>, <b>VACUUM_CLEANER</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public enum ApplianceTagName {
    LAPTOP,
    OVEN,
    REFRIGERATOR,
    SPEAKERS,
    TABLET_PC,
    VACUUM_CLEANER;

    /**
     * Private constructor to close the ability of instantiating {@link ApplianceTagName}.
     */
    private ApplianceTagName() {
    }
}
