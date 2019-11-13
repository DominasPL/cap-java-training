import pl.github.DominasPL.arrays.SimpleArray;
import pl.github.DominasPL.loops.LoopsTest;
import pl.github.DominasPL.methods.MyString;
import pl.github.DominasPL.methods.Temperature;
import pl.github.DominasPL.objects.Dog;
import pl.github.DominasPL.objects.Owner;
import pl.github.DominasPL.scanner_and_primitives.Subjects;

import java.util.Random;

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
        int[][] grades = new int[4][];
        grades[0] = new int[] {2, 4, 6, 2, 4};
        grades[1] = new int[] {2, 5, 6};
        grades[2] = new int[] {2, 4, 5};
        grades[3] = new int[] {1, 4, 5, 3, 2};

        double[] averages = Subjects.countAverageRating(grades);
        for (double average : averages) {
            System.out.println("Subject 1 grades average: " + average);
        }


    }


}
