//package 02_Introduction_InputOutput.sample;

import java.io.*;
import java.util.Scanner;

public class AverageCalculator {

    public static void calculateAverage(String filePath) {
        double sum = 0;
        int count = 0;
        Scanner scanner = null;

        try {
            // Open the file with Scanner for reading
            scanner = new Scanner(new File(filePath));

            // Read numbers from the file
            while (scanner.hasNext()) {
                // Check if the next token is a number
                if (scanner.hasNextDouble()) {
                    sum += scanner.nextDouble();
                    count++;
                } else {
                    // Skip non-numeric tokens
                    scanner.next();
                }
            }

            // Calculate the average if numbers were found
            if (count > 0) {
                double average = sum / count;
                System.out.printf("The average of the numbers in the file is: %.2f%n", average);
            } else {
                System.out.println("No valid numbers were found in the file.");
            }

        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.err.println("Error: The file " + filePath + " does not exist.");
        } finally {
            // Ensure that the scanner is closed, even if an exception occurs
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    // Example usage in a main method
    public static void main(String[] args) {
        calculateAverage("data.txt");
    }
}
