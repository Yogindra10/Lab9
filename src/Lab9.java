import java.util.Scanner;
import java.util.Random;


public class Lab9 {
    static void main(String[] args) {
        int sum = 0;
        int min = 100;
        int max = 0;
        int count = 0;
        int userInt1 = 0;
        int userInt2 = 0;
        int pos = 0;
        double avg = 0;
        boolean found = false;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        for (int x : dataPoints) {
            System.out.print(x + "|");
        }

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];

            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        userInt1 = InputHelper.getRangedInt(scan, "\nEnter a integer value between 1 and 100.", 1, 100);
        userInt2 = InputHelper.getRangedInt(scan, "\nEnter a integer value between 1 and 100.", 1, 100);


        for (int x : dataPoints) {
            if (x == userInt1) {
                count++;
            }
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInt2) {
                found = true;
                pos = i;
                break;
            }
        }

        //calculations
        avg = (double) sum / (dataPoints.length);


        //outputs
        System.out.println("\n\nThe Sum is: " + sum);
        System.out.println("\nThe Average is: " + avg);
        System.out.println("\nThe Max is: " + max);
        System.out.println("\nThe Min is: " + min);



        System.out.println("Your number " + userInt1 + " was found " + count + " times");

        if (found) {
            System.out.println("The value " + userInt2 + " was found at array index " + pos );
        } else {
            System.out.println("The value " + userInt2 + " was not found");
        }
    }
}