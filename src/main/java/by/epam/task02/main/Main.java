package by.epam.task02.main;

import by.epam.task02.constant.ApplianceFieldConstant;
import by.epam.task02.constant.ApplianceNameConstant;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
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
        criteriaLaptop.add(ApplianceFieldConstant.OS, "MACOS");
        criteriaLaptop.add(ApplianceFieldConstant.MEMORY_ROM, 16000.0);

        appliances = service.find(criteriaLaptop);

        PrinterApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        criteriaLaptop = new Criteria(ApplianceNameConstant.OVEN);
        criteriaLaptop.add(ApplianceFieldConstant.HEIGHT, 200.0);
        criteriaLaptop.add(ApplianceFieldConstant.DEPTH, 300.0);

        appliances = service.find(criteriaLaptop);

        PrinterApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(ApplianceNameConstant.TABLET_PC);
        criteriaTabletPC.add(ApplianceFieldConstant.COLOR, "BLUE");
        criteriaTabletPC.add(ApplianceFieldConstant.DISPLAY_INCHES, 15.0);
        criteriaTabletPC.add(ApplianceFieldConstant.MEMORY_ROM, 12000.0);

        appliances = service.find(criteriaTabletPC);// find(Object...obj)

        PrinterApplianceInfo.print(appliances);

    }

}
