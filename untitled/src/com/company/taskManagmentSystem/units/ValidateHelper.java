package com.company.taskManagmentSystem.units;

import com.company.taskManagmentSystem.exception.UserInvalidException;

import java.util.List;

public class ValidateHelper {

    private static final String INVALID_NUMBER_OF_ARGUMENTS = "Invalid number of arguments. Expected: %d; received: %d.";


    public static void validateString(int value, int min, int max, String errorMessage) {
        if (value < min || value > max) {
            throw new UserInvalidException(errorMessage);
        }
    }

    public static void validateArgumentsCount(List<String> list, int expectedNumberOfParameters) {
        if (list.size() < expectedNumberOfParameters || list.size() > expectedNumberOfParameters) {
            throw new IllegalArgumentException(String.format(INVALID_NUMBER_OF_ARGUMENTS,
                    expectedNumberOfParameters, list.size()));
        }
    }
}
