package by.epam.task02.main;

import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.entity.criteria.SearchCriteria;
import by.epam.task02.exception.DaoException;
import by.epam.task02.exception.ServiceException;
import by.epam.task02.service.ApplianceService;
import by.epam.task02.service.ServiceFactory;
import by.epam.task02.util.PrinterApplianceInfo;

import java.util.List;

public class Main {

    public static void main(String[] args) throws ServiceException, DaoException {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaLaptop = new Criteria(ApplianceNameConstant.LAPTOP);
        criteriaLaptop.add(SearchCriteria.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), 1000.0);

        appliances = service.find(criteriaLaptop);

        PrinterApplianceInfo.print(appliances);


        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(ApplianceNameConstant.OVEN);
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.name(), 45.0);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.name(), 60.0);

        appliances = service.find(criteriaOven);

        PrinterApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(ApplianceNameConstant.TABLET_PC);
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.name(), "BLUE");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.name(), 15.0);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.name(), 12000.0);

        appliances = service.find(criteriaTabletPC);

        PrinterApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaSpeakers = new Criteria(ApplianceNameConstant.SPEAKERS);
        criteriaSpeakers.add(SearchCriteria.PriceFilter.MORE_THAN_CURRENT_PRICE.name(), 300.0);

        appliances = service.find(criteriaTabletPC);

        PrinterApplianceInfo.print(appliances);

    }

}
