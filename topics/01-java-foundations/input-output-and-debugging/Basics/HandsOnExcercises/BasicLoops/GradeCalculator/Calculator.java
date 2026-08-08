import java.util.Scanner;
import java.util.Arrays;

class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double grades[] = new double[8];

        System.out.println("Grade Calculator \n" +
                "==================");

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = in.nextDouble();
        }
        double sum = 0;
        for (double grade: grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        System.out.println("Average grade is: " + average);
    }
}