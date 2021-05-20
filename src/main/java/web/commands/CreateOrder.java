package web.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateOrder extends CommandProtectedPage {
    public CreateOrder(String pageToShow, String role) {
        super(pageToShow, role);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return super.execute(request, response);
    }
}
