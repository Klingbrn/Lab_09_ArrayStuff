import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
            System.out.print(dataPoints[i] + " | ");
        }
        SafeInput.PrintArray(dataPoints);
        int sum = 0;
        for (int e : dataPoints) {
            sum += e;
        }
        double average = SafeInput.getAverage(dataPoints);
        System.out.println("\nThe sum of the dataPoints array is: " + sum);
        System.out.printf("The average of the dataPoints array is: %.2f%n", average);

        int searchValue = SafeInput.getRangeInt(in, "Enter an integer value to search for", 1, 100);
        int count = 0;
        for (int val : dataPoints) {
            if (val == searchValue) {
                count++;
            }
        }
        System.out.println("The value " + searchValue + " was found " + count + " times in the array.");

        int searchFirst = SafeInput.getRangeInt(in, "Enter another integer to find its first occurrence", 1, 100);
        boolean found = false;
        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchFirst) {
                position = i;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The value " + searchFirst + " was found at array index " + position);
        } else {
            System.out.println("The value " + searchFirst + " was not found in the array.");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int val : dataPoints) {
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }
        System.out.println("the minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("Average of the data points is: " + SafeInput.getAverage(dataPoints));

    }
}

