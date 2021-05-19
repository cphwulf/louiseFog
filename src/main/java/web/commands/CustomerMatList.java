package web.commands;

import business.exceptions.UserException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerMatList extends Command {
    public CustomerMatList(String matlistpage) {
        super();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {
        // udregn styklisten - Bom = calc.getBom() - en liste af bomItems (
        //
    }
}
