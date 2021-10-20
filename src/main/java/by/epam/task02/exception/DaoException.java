package by.epam.task02.exception;

/**
 * DaoException class.
 * This class needed to throw exceptions on the dao layer.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class DaoException extends Exception {

    /**
     * Parameterless DaoException constructor
     */
    public DaoException() {
        super();
    }

    /**
     * DaoException constructor with parameter
     *
     * @param message - message
     */
    public DaoException(String message) {
        super(message);
    }

    /**
     * DaoException constructor with parameters
     *
     * @param message - message
     * @param e       - exception
     */
    public DaoException(String message, Exception e) {
        super(message, e);
    }

    /**
     * DaoException constructor with parameter
     *
     * @param e - exception
     */
    public DaoException(Exception e) {
        super(e);
    }

}
