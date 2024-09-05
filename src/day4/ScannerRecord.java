package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerRecord {
    public void record() {
        Scanner input = new Scanner(System.in);
        boolean isContinue = true;
        ArrayList<Integer> numbers = new ArrayList<>();
        while (isContinue) {
            System.out.println("Enter your number");
            int num1 = input.nextInt();
            numbers.add(num1);
            System.out.println("Press Y to continue, N to stop");
            String choice = input.next();
            if (choice.equalsIgnoreCase("N")) {
                isContinue = false;
            }
        }
        StringBuilder result = new StringBuilder();
        for (Integer num: numbers) {
            result.append(num).append(", ");
        }

        if (!result.isEmpty()) {
            result.delete(result.length() - 2, result.length());
        }
        System.out.println(result);
    }
}
