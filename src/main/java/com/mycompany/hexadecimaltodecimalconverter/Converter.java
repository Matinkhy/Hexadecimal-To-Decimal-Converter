package com.mycompany.hexadecimaltodecimalconverter;

public class Converter {

    private static final String digits = "0123456789ABCDEF";

    public static int HexaToDecimal(String HD) { // HD stands for hexadecimal
        int dec = 0, i;
        for (i = 0; i < HD.length(); i++) {
            dec = 16 * dec + digits.indexOf(HD.charAt(i));
        }
        return dec;
    }

    public static String DecimalToHexa(int Dec) { // Dec stands for decimal
        String hex = "";
        if (Dec == 0) {
            return "0";
        }
        while (Dec > 0) {
            hex = digits.charAt(Dec % 16) + hex;
            Dec /= 16;
        }
        return hex;
    }
}
