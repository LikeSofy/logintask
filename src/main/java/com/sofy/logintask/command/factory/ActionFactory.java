package com.sofy.logintask.command.factory;

import javax.servlet.http.HttpServletRequest;
import com.sofy.logintask.command.ActionCommand;
import com.sofy.logintask.command.EmptyCommand;
import com.sofy.logintask.command.client.CommandEnum;
import com.sofy.logintask.resource.MessageManager;

public class ActionFactory {
    public ActionCommand defineCommand(HttpServletRequest request) {
        ActionCommand current = new EmptyCommand();
        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            return current;
        }
        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
            current = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
            request.setAttribute("wrongAction", action
                    + MessageManager.getProperty("message.wrongaction"));
        }
        return current;
    }
}
