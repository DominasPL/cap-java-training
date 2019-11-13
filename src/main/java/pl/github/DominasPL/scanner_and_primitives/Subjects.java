package pl.github.DominasPL.scanner_and_primitives;

public class Subjects {

    public static double[] countAverageRating(int[][] grades) {

        double[] averages = new double[grades.length];
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            averages[i] = sum / grades[i].length;
        }

        return averages;
    }


}
