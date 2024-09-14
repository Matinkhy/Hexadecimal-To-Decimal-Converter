package com.mycompany.hexadecimaltodecimalconverter;

import java.util.Scanner;

public class HexadecimalToDecimalConverter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean loop = true;

        while (loop) {

            loop = false;

            System.out.println("Which conversion would you like? (Enter 1 or 2)");
            System.out.println("1) Decimal to Hexadecimal    2) Hexadecimal to Decimal");
            String input = scanner.next();

            switch (input) {

                case "1" -> {
                    System.out.println("Enter your hexadecimal string to get it in decimal");
                    String HD = scanner.next();     // HD stands for Hexadecimal
                    System.out.println("Your hexadecimal string is equal to " + Converter.HexaToDecimal(HD));
                }

                case "2" -> {
                    System.out.println("Enter your number string to get it in decimal");
                    int Dec = scanner.nextInt();     // Dec stands for decimal
                    System.out.println("Your number in hexadecimal is " + Converter.DecimalToHexa(Dec));
                }

                default -> {
                    System.out.println("That is not an option, try again");
                    System.out.println("");
                    loop = true;
                }

            }
        }
    }
}
