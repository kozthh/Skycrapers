package topics.foundations.basicloops.sorting;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Sorting {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Integer[] numbers = new Integer[5];
        boolean exit = true;

        while (exit) {
            System.out.println("Pick to assort the numbers in ascending or descending order: ");
            System.out.println("1. Ascending");
            System.out.println("2. Descending");
            System.out.println("3. Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        numbers[i] = input.nextInt();
                    }
                    Arrays.sort(numbers);
                    System.out.println("Numbers in ascending order: " + Arrays.toString(numbers));
                    break;

                case 2:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        numbers[i] = input.nextInt();
                    }
                    Arrays.sort(numbers, Collections.reverseOrder());
                    System.out.println("Numbers in ascending order: " + Arrays.toString(numbers));
                    break;

                case 3:
                    exit = false;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    throw new IllegalArgumentException("Invalid choice: " + choice);
            }

        }
    }
}