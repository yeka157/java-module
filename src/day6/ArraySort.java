package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
    Scanner input = new Scanner(System.in);
    public void sortArray() {
        boolean isStop = false;
        System.out.println("Enter the number, Press Y to stop");
        ArrayList<Integer> userInput = new ArrayList<>();
        while (!isStop) {
            String number = input.next();
            if (number.equals("Y")) {
                isStop = true;
            } else {
                userInput.add(Integer.parseInt(number));
            }
        }
        System.out.println("Enter the sort direction (asc, desc)");
        String sortMethod = input.next();
        if (sortMethod.equals("asc")) {
            Collections.sort(userInput);
        } else if (sortMethod.equals("desc")) {
            userInput.sort(Collections.reverseOrder());
        }
        System.out.println(userInput.toString());
    }
}
