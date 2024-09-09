package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDuplicates {
    Scanner input = new Scanner(System.in);
    public void containDuplicates() {
        System.out.println("Enter the length of array");
        int length = input.nextInt();
        int[] array = new int[length];

        System.out.println("Enter " + length + " numbers");
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }

        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> nonDuplicates = new ArrayList<>();
        for (int i = 0; i< length; i++) {
            if (!nonDuplicates.contains(array[i])) {
                nonDuplicates.add(array[i]);
            } else {
                duplicates.add(array[i]);
            }
        }
        System.out.println(!duplicates.isEmpty());
    }
}
