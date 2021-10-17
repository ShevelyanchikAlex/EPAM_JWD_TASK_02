package by.epam.task02.main;

import static by.epam.task02.entity.criteria.SearchCriteria.*;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.service.ApplianceService;
import by.epam.task02.service.ServiceFactory;

public class Main {

    public static void main(String[] args) {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

//        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
//        criteriaOven.add(Oven.CAPACITY.toString(), 3);
//
//        appliance = service.find(criteriaOven);
//
//        PrintApplianceInfo.print(appliance);
//
//        //////////////////////////////////////////////////////////////////
//
//        criteriaOven = new Criteria(Oven.class.getSimpleName());
//        criteriaOven.add(Oven.HEIGHT.toString(), 200);
//        criteriaOven.add(Oven.DEPTH.toString(), 300);
//
//        appliance = service.find(criteriaOven);
//
//        PrintApplianceInfo.print(appliance);
//
//        //////////////////////////////////////////////////////////////////
//
//        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
//        criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
//        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
//        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);
//
//        appliance = service.find(criteriaOven);// find(Object...obj)
//
//        PrintApplianceInfo.print(appliance);

    }

}
