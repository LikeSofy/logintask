package com.sofy.logintask.command;

import javax.servlet.http.HttpServletRequest;
import com.sofy.logintask.resource.ConfigurationManager;

public class EmptyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.login");
        return page;
    }
}
