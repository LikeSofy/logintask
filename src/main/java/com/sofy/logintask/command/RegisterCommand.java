package com.sofy.logintask.command;

import com.sofy.logintask.resource.ConfigurationManager;
import com.sofy.logintask.resource.MessageManager;
import com.sofy.logintask.util.validator.RegistrationValidator;
import com.sofy.logintask.entity.warehouse.UserWarehouse;

import javax.servlet.http.HttpServletRequest;

public class RegisterCommand implements ActionCommand{
    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";
    private RegistrationValidator validator = new RegistrationValidator();

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String pass = request.getParameter(PARAM_NAME_PASSWORD);
        if (validator.isUserNameValid(login)) {
            UserWarehouse.getWarehouse().add(login, pass);
            page = ConfigurationManager.getProperty("path.page.login");
        } else {
            request.setAttribute("errorRegistrationMessage",
                    MessageManager.getProperty("message.registererror"));
            page = ConfigurationManager.getProperty("path.page.registration");
        }
        return page;
    }
}
