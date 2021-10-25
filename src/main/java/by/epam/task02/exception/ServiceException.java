package by.epam.task02.exception;

/**
 * ServiceException class.
 * This class needed to throw exceptions on the service layer.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ServiceException extends Exception {

    /**
     * Parameterless ServiceException constructor
     */
    public ServiceException() {
        super();
    }

    /**
     * ServiceException constructor with parameter
     *
     * @param message message
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * ServiceException constructor with parameters
     *
     * @param message message
     * @param e       exception
     */
    public ServiceException(String message, Exception e) {
        super(message, e);
    }

    /**
     * ServiceException constructor with parameter
     *
     * @param e exception
     */
    public ServiceException(Exception e) {
        super(e);
    }

}
