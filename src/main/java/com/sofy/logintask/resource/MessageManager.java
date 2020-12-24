package com.sofy.logintask.resource;

import java.util.ResourceBundle;
import java.util.logging.Logger;

public class MessageManager {
    private final static ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    private MessageManager() { }
    public static String getProperty(String key) {
        System.out.print(resourceBundle);
        return resourceBundle.getString(key);
    }
}
