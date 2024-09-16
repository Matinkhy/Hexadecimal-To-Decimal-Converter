package com.mycompany.hexadecimaltodecimalconverter;

import java.lang.Math.*;

public class Converter {

    private static final String digits = "0123456789ABCDEF";
    private static String hex = "";
    private static int dec = 0;
    private static String bin = "";
    private static boolean loop;

    public static int HexaToDecimal(String HD) { // HD stands for hexadecimal
        int i;
        String UpperCaseHD = HD.toUpperCase();
        for (i = 0; i < UpperCaseHD.length(); i++) {
            dec = 16 * dec + digits.indexOf(UpperCaseHD.charAt(i));
        }
        return dec;
    }

    public static String DecimalToHexa(int Dec) { // Dec stands for decimal
        
        if (Dec == 0) {
            return "0";
        }
        while (Dec > 0) {
            hex = digits.charAt(Dec % 16) + hex;
            Dec /= 16;
        }
        return hex;
    }

    public static String DecimalToBinary(int Dec) { // Dec stands for decimal

        if (Dec == 0) {
            return "0";
        } else {
            int rem;
            for (int i = 0; Dec > 0; i++) {
                rem = Dec % 2;
                if (i % 4 == 0) {
                    bin = " " + bin;
                }
                bin = rem + bin;
                Dec = Dec / 2;
            }

            return bin;
        }
    }

    public static int BinaryToDecimal(int Bin) { // Bin stands for binary
        Bin = Integer.parseInt(bin);
        int n = 0;
        while (Bin > 0) {
            int temp = Bin % 10;
            dec = (int) (dec + temp * Math.pow(2, n));
            Bin = Bin / 10;
            n++;
        }
        return dec;
    }

    public static boolean incorrectOption() {
        System.out.println("That is not an option, try again");
        System.out.println("");
        return loop = true;
    }

}
