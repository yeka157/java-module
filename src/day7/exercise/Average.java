package day7.exercise;

import java.util.Scanner;

public class Average {
    Scanner scanner = new Scanner(System.in);

    public void countAverage() {
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter a number, press q to stop:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            } else {
                try {
                    sum += Integer.parseInt(input);
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input" + e.getMessage());
                }
            }
        }
        if (count == 0) {
            System.out.println("No number entered");
        } else {
            System.out.println("Average: " + (double) sum / count);
        }
        scanner.close();
    }
}
