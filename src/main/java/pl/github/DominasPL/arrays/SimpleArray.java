package pl.github.DominasPL.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SimpleArray {

    public static int sumArrayElements(int[] numbers) {

        return Arrays.stream(numbers)
                .sum();

    }


    public static int returnTheGreatestNumber(int[] numbers) {

        return Arrays.stream(numbers)
                .max()
                .getAsInt();
    }

    public static void createSudokuBoard() {

        int[][][] sudoku = new int[9][3][3];

        for (int i = 0; i < sudoku.length; i++) {
            if (i == 3 || i == 6) {
                System.out.println();
            }
            for (int j = 0; j < sudoku[i].length; j++) {
                for (int k = 0; k < sudoku[j].length; k++) {
                    System.out.print(sudoku[i][j][k] + " ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }


}
