import java.util.Scanner;

public class GradeSystem {

    public static double calcAverage(int[] grades) {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.length;
    }

    public static int findMax(int[] grades) {
        int max = grades[0];
        for (int g : grades) {
            if (g > max) {
                max = g;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        double avg = calcAverage(grades);
        int max = findMax(grades);

        System.out.println("Average: " + avg);
        System.out.println("Highest Grade: " + max);
    }
}