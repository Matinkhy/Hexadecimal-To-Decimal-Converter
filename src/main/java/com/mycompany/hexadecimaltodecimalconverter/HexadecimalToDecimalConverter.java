package com.mycompany.hexadecimaltodecimalconverter;

import java.util.Scanner;

public class HexadecimalToDecimalConverter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean loop = true;

        while (loop) {

            loop = false;

            System.out.println("What would you like to convert from? (Enter 1, 2, or 3)");
            System.out.println("1) Decimal    2) Hexadecimal    3) Binary");
            int input = scanner.nextInt();

            switch (input) {

                case 1 -> {
                    System.out.println("Which numerical system would you like to convert to? (Enter 1 or 2)");
                    System.out.println("1) Hexadecimal  2) Binary");
                    input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("Enter your number to get it in hexadecimal");
                        int dec = scanner.nextInt();     // dec stands for decimal
                        System.out.println("Your number is equal to " + Converter.DecimalToHexa(dec));
                    } else if (input == 2) {
                        System.out.println("Enter your number to get it in binary");
                        int dec = scanner.nextInt();     // dec stands for decimal
                        System.out.println("Your number is equal to " + Converter.DecimalToBinary(dec));
                    } else {
                        loop = Converter.incorrectOption();
                    }
                }

                case 2 -> {

                    System.out.println("Which numerical system would you like to convert to? (Enter 1 or 2)");
                    System.out.println("1) Decimal  2) Binary");
                    input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("Enter your hexadecimal string to get it in decimal");
                        String HD = scanner.next();     // HD stands for Hexadecimal
                        System.out.println("Your hexadecimal string is equal to " + Converter.HexaToDecimal(HD));
                    } else if (input == 2) {
                        System.out.println("Enter your hexadecimal string to get it in binary");
                        String HD = scanner.next();     // HD stands for Hexadecimal
                        System.out.println("Your hexadecimal string is equal to " + Converter.DecimalToBinary(Converter.HexaToDecimal(HD)));
                    } else {
                        loop = Converter.incorrectOption();
                    }
                }

                case 3 -> {

                    System.out.println("Which numerical system would you like to convert to? (Enter 1 or 2)");
                    System.out.println("1) Decimal  2) Hexadecimal");
                    input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("Enter your binary number to get it in decimal");
                        int Bin = scanner.nextInt();     // Bin stands for Binary
                        System.out.println("Your binary number is equal to " + Converter.BinaryToDecimal(Bin));
                    } else if (input == 2) {
                        System.out.println("Enter your binary number to get it in hexadecimal");
                        int Bin = scanner.nextInt();     // Bin stands for Binary
                        System.out.println("Your binary number is equal to " + Converter.DecimalToHexa(Converter.BinaryToDecimal(Bin)));
                    } else {
                        loop = Converter.incorrectOption();
                    }
                }

                default -> {
                    loop = Converter.incorrectOption();
                }

            }
        }
    }
}
