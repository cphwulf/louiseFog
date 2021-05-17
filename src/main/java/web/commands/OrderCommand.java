package web.commands;

import business.exceptions.UserException;
import business.persistence.Database;
import business.services.UserFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderCommand extends CommandUnprotectedPage {
    private UserFacade userFacade;

    public OrderCommand(String pageToShow) {
        super(pageToShow);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {


        return pageToShow;
    }

    //TODO:Add error message for general issues e.g. "Something went wrong"
    //TODO:Add error message for invalid chararacters such as letter instead of numbers e.g. "Please enter numbers"
    //TODO:Add clarification for unit to be used for the customers measurements

}
