package pl.github.DominasPL.exceptions;

import java.util.Scanner;

public class NumberSqrt {

    public static double calculateSqrt() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        long number;

        try {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                throw new IllegalArgumentException("Number must be positive!");
            }
            return Math.sqrt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return 0;
    }



}
