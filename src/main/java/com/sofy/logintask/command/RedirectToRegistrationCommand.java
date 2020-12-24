package com.sofy.logintask.command;

import com.sofy.logintask.resource.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class RedirectToRegistrationCommand implements ActionCommand{
    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.registration");
        return page;
    }
}
