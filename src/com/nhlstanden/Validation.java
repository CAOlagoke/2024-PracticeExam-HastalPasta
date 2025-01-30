package com.nhlstanden;

public interface Validation {

    boolean isSafeString(String stringToBeChecked, boolean isDigitMandatory, int minimumLengthOfString);
}
