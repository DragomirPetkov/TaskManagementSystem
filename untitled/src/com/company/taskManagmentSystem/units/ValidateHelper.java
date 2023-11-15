package com.company.taskManagmentSystem.units;

import com.company.taskManagmentSystem.exception.UserInvalidException;

public class ValidateHelper {

    public static void validateString(int value, int min, int max, String errorMessage) {
        if (value < min || value > max) {
            throw new UserInvalidException(errorMessage);
        }
    }
}
