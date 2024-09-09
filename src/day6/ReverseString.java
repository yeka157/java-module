package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    Scanner input = new Scanner(System.in);
    public void reverseString() {
        System.out.println("Enter the string to reverse");
        String str = input.nextLine();
        char[] strArray = str.toCharArray();
        StringBuilder strReversed = new StringBuilder();
        for (int i = strArray.length - 1; i >= 0; i--) {
            strReversed.append(strArray[i]);
        }
        System.out.println(strReversed);
    }
}
