package com.sofy.logintask.logic;

import com.sofy.logintask.entity.warehouse.UserWarehouse;

public class LoginLogic {

    public static boolean checkLogin(String enterLogin, String enterPass) {
        Boolean result = UserWarehouse.getWarehouse().find(enterLogin, enterPass).isPresent();

        return result;
    }
}