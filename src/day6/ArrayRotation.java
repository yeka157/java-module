package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    Scanner input = new Scanner(System.in);
    public void rotateArray() {
        System.out.println("Enter the length of array");
        int length = input.nextInt();
        int[] array = new int[length];

        System.out.println("Enter " + length + " numbers");
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Enter the number of times to rotate the array");
        int rotate = input.nextInt();

        int[] rotatedArray = new int[length];
        for (int i = 0; i < length; i++) {
            rotatedArray[(i + rotate) % length] = array[i];
        }

        System.out.println("Rotated array is: " + Arrays.toString(rotatedArray));
    }
}
