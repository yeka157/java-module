package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDuplicate {
    Scanner input = new Scanner(System.in);

    public void findDuplicate() {
        System.out.println("Enter the number, Press Y to stop");
        boolean isStop = false;
        ArrayList<Integer> numbers = new ArrayList<>();
        while (!isStop) {
            String number = input.next();
            if (number.equalsIgnoreCase("Y")) {
                isStop = true;
            } else {
                numbers.add(Integer.parseInt(number));
            }
        }
        ArrayList<Integer> nonDuplicates = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            for (int j = i + 1; j < numbers.size(); j++) {
//                if (numbers.get(i) == numbers.get(j)) {
//                    duplicates.add(numbers.get(i));
//                }
//            }
//        }
        for (Integer number : numbers) {
            if (!nonDuplicates.contains(number)) {
                nonDuplicates.add(number);
            } else {
                duplicates.add(number);
            }
        }
        System.out.println(duplicates.toString());
    }
}
