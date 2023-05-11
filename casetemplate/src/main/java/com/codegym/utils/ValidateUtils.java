package com.codegym.utils;

import java.util.regex.Pattern;

public class ValidateUtils {

    public static final String NAME_REGEX = "^[A-Za-z][A-Za-z0-9_ ]{7,19}$";
    public static boolean isNameValid(String name) {
        return Pattern.matches(NAME_REGEX, name);
    }
}
