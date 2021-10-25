package by.epam.task02.constant;

/**
 * ExceptionMessageConstant class with constants <b>ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG</b>,
 * <b>ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG</b>, <b>INVALID_CRITERIA_EXCEPTION_MSG</b>,
 * <b>APPLIANCES_LIST_NULL_EXCEPTION_MSG</b>, <b>APPLIANCES_LIST_EMPTY_EXCEPTION_MSG</b> ,
 * <b>ILLEGAL_ARGUMENT_MATCHER_FACTORY_EXCEPTION_MSG</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public final class ExceptionMessageConst {

    public static final String ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG = "No such appliance factory exists.";
    public static final String ILLEGAL_ARGUMENT_MATCHER_FACTORY_EXCEPTION_MSG = "No such appliance matcher exists.";
    public static final String ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG = "No such appliance search criteria exists.";
    public static final String INVALID_CRITERIA_EXCEPTION_MSG = "Criteria is not Valid!";
    public static final String APPLIANCES_LIST_NULL_EXCEPTION_MSG = "AppliancesList is null.\nAppliancesList cannot be null!";
    public static final String APPLIANCES_LIST_EMPTY_EXCEPTION_MSG = "AppliancesList is empty (appliances not found).";

    /**
     * Private constructor to close the ability of instantiating ExceptionMessageConstant.
     */
    private ExceptionMessageConst() {
    }
}
