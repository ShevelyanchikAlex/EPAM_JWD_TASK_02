package by.epam.task02.dao.constant;

/**
 * DaoExceptionMessage enum.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public enum DaoExceptionMessage {
    ILLEGAL_ARGUMENT_APPLIANCE_FACTORY_EXCEPTION_MSG("No such appliance factory exists.");

    private final String message;

    /**
     * Private constructor to close the ability of instantiating {@link DaoExceptionMessage}.
     *
     * @param message message of DaoException
     */
    private DaoExceptionMessage(String message) {
        this.message = message;
    }

    /**
     * Gets message
     *
     * @return message
     */
    public String getMessage() {
        return message;
    }
}
