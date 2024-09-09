package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemove {
    Scanner input = new Scanner(System.in);

    public void removeDuplicate() {
        System.out.println("Enter the number, Press Y to stop");
        boolean isStop = false;
        ArrayList<Integer> userInput = new ArrayList<>();
        while (!isStop) {
            String number = input.next();
            if (number.equals("Y")) {
                isStop = true;
            } else {
                userInput.add(Integer.parseInt(number));
            }
        }
//        System.out.println("Enter the length of array");
//        int length = input.nextInt();
//        int[] array = new int[length];
//        int[] temp = new int[length];
//        int j = 0;
//
//        System.out.println("Enter " + length + " numbers");
//        for (int i = 0; i < length; i++) {
//            array[i] = input.nextInt();
//        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : userInput) {
            if (!list.contains(integer)) {
                list.add(integer);
            }
        }
        System.out.println(list.toString());
    }
}
