package pl.github.DominasPL.loops;

import java.util.Arrays;

public class LoopsTest {

    public static void displayTenNumbers() {

        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
    }

    public static void displayOddNumbers()  {
//        for (int i = -10; i <= 40; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
        int i = -10;
        while (i <= 40) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }


    public static void sumArrayElements(int[][] numbers) {

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }

        System.out.println("Array elements sum = " + sum);
    }
}
