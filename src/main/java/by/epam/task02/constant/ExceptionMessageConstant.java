package by.epam.task02.constant;

public final class ExceptionMessageConstant {

    public static final String ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG = "No such appliance factory exists.";
    public static final String ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG = "No such appliance search criteria exists.";

    public static final String INVALID_CRITERIA_EXCEPTION_MSG = "Criteria is not Valid!";

    public static final String APPLIANCES_LIST_NULL_EXCEPTION_MSG = "AppliancesList is null.\nAppliancesList cannot be null!";
    public static final String APPLIANCES_LIST_EMPTY_EXCEPTION_MSG = "AppliancesList is empty (appliances not found).";

    private ExceptionMessageConstant() {
    }
}
