package com.sofy.logintask.command.client;
import com.sofy.logintask.command.*;

public enum CommandEnum {
    REDIRECTTOREGISTRATION {
        {
            this.command = new RedirectToRegistrationCommand();
        }
    },
    REGISTER {
        {
            this.command = new RegisterCommand();
        }
    },
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    };
    ActionCommand command;
    public ActionCommand getCurrentCommand() {
        return command;
    }
}
