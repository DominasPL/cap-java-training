
import pl.github.DominasPL.inheritance.Animal;
import pl.github.DominasPL.inheritance.Carp;
import pl.github.DominasPL.interfaces.Addition;
import pl.github.DominasPL.interfaces.Computation;
import pl.github.DominasPL.interfaces.Multiplication;

import javax.xml.crypto.Data;
import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//        //Exercise1
//        System.out.println("Temperature is greater than 0: " + Temperature.checkIsPositive(-20.0));
//
//        //Exercise2
//        Owner owner = new Owner("Arkadiusz", "Gejsheimer");
//        Dog dog = new Dog("Fafik", 20, owner);
//        System.out.println(dog);

//        //Exercise3
//        MyString.displayTextAndCountLen("Today is rainny day", "There is too much snow outside", "We have sunny, hot day");

        //Exercise 4
//        int[] numbers = {2, 4, 2, 10, 92};
//        System.out.println(SimpleArray.sumArrayElements(numbers));
//        System.out.println(SimpleArray.returnTheGreatestNumber(numbers));
//        SimpleArray.createSudokuBoard();

        //Exercise 5
//        int [][] numbers = new int[3][3];
//        Random random = new Random();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                numbers[i][j] = random.nextInt(10);
//            }
//        }
//        LoopsTest.displayOddNumbers();
//        LoopsTest.sumArrayElements(numbers);


        //Exercise 6
//        int[][] grades = new int[4][];
//        grades[0] = new int[] {2, 4, 6, 2, 4};
//        grades[1] = new int[] {2, 5, 6};
//        grades[2] = new int[] {2, 4, 5};
//        grades[3] = new int[] {1, 4, 5, 3, 2};
//
//        double[] averages = Subjects.countAverageRating(grades);
//        for (double average : averages) {
//            System.out.println("Subject 1 grades average: " + average);
//        }

        //Exercise 7
//
//        Computation computation;
//
//        if (getUserChoice().equals("M")) {
//            computation = new Multiplication();
//        } else {
//            computation = new Addition();
//        }
//
//        double arg1 = getArgument();
//        double arg2 = getArgument();
//
//        double result = computation.compute(arg1, arg2);
//
//        System.out.println("The result is: " + result);

        //Exercise 8
        Animal carp = new Carp();
        System.out.println(carp.toString());




    }

    public static long getArgument() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        while (!scanner.hasNextLong()) {
            scanner.nextLine();
            System.out.print("Give a number: ");
        }

        long l = scanner.nextLong();
        scanner.nextLine();

        return l;
    }



    public static String getUserChoice() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Multiply or add? M/A: ");
            String answer = scanner.nextLine();

            if (answer.equals("M") || answer.equals("A")) {
                return answer;
            } else {
                System.out.println("Incorrect choice. Please try again!");
            }
        }
    }


}
