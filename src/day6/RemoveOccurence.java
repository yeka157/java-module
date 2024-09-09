package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOccurence {
    public void removeOccurence() {
        Scanner input = new Scanner(System.in);
        boolean isStop = false;
        System.out.println("Enter the number, press Y to Stop");
        ArrayList<Integer> numbers = new ArrayList<>();
        while (!isStop) {
            String number = input.next();
            if (number.equalsIgnoreCase("Y")) {
                isStop = true;
            } else {
                numbers.add(Integer.parseInt(number));
            }
        }
        System.out.println("Enter the number to remove");
        int remove = input.nextInt();
        ArrayList<Integer> answer = new ArrayList<>();
        for (Integer number : numbers) {
            if (number != remove) {
                answer.add(number);
            }
        }
        System.out.println(answer.toString());
    }
}
