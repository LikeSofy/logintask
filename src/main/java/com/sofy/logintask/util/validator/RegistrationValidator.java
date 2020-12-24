package com.sofy.logintask.util.validator;

import com.sofy.logintask.entity.warehouse.UserWarehouse;

import java.util.List;

public class RegistrationValidator {
    public boolean isUserNameValid(String name){
        boolean result = true;
        List<String> names = UserWarehouse.getWarehouse().usersName();
        for (String name_in : names){
            if (name_in.equals(name)){
                result = false;
            }
        }

        return result;
    }
}
