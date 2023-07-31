package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        return org.apache.commons.lang3.math.NumberUtils.toInt(str) > 0;
    }
}
