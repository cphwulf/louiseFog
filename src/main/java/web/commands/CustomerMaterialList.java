package web.commands;

import business.entities.Order;
import business.entities.OrderItems;
import business.entities.SimpleOrder;
import business.exceptions.UserException;
import business.services.MaterialFacade;
import business.services.OrderFacade;
import business.services.UserFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class CustomerMaterialList extends CommandProtectedPage {
    MaterialFacade materialFacade;
    OrderFacade orderFacade;
    CarportCalculator carportCalculator;

    public CustomerMaterialList(String customermateriallist, String role) {
        super(customermateriallist, role);
        materialFacade = new MaterialFacade(database);
        orderFacade = new OrderFacade(database);
        carportCalculator = new CarportCalculator(materialFacade);
    }
    //Har materialeliste og ordre
//TODO: Materialfacade skal virke
    //Der skal komme ordreID ind et sted
    //TODO:OrderItems skal sendes med. Antal af materialer skal med andetsteds fra. Kan beregnes ud fra indsendte mål.
    //TODO:Lav en calculator i stedet for en facade der kan opnå dette
    //Drop database i 1. omgang,
    //Forstå flow, begynd beregning af hvor mange materialer ud fra eksisterende ordrer
    //Materiale og
    //Styling

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session=request.getSession();
        String s[] = request.getParameterValues("id");
        int ordreId=0;
        if (s != null && s.length != 0) {
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i] + "\n" + "Thank you");
                ordreId=Integer.parseInt(s[i]);
            }
        }

        List<String> materialList = materialFacade.getAllMaterial();
        //SimpleOrder simpleOrder = new SimpleOrder(1,1,600, 780);
        Order order = orderFacade.getOrderById(ordreId);

        List<OrderItems> orderedItems = new ArrayList<>();
        //materialliste skal lave en ny
        request.setAttribute("matList", materialList);
        return pageToShow;
    }
}
