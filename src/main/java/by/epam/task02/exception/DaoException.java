package by.epam.task02.exception;

public class DaoException extends Exception {

    public DaoException() {
        super();
    }

    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Exception e) {
        super(message, e);
    }

    public DaoException(Exception e) {
        super(e);
    }

}
