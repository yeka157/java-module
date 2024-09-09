package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Temperature {
    Scanner input = new Scanner(System.in);

    public void waitForWarm() {
        System.out.println("Enter the temperature for n days, press Y to stop");
        boolean isStop = false;
        ArrayList<Integer> temperatures = new ArrayList<>();
        while (!isStop) {
            String temp = input.next();
            if (temp.equalsIgnoreCase("Y")) {
                isStop = true;
            } else {
                temperatures.add(Integer.parseInt(temp));
            }
        }
        int[] daysToWait = new int[temperatures.size()];
        for (int i = 0; i < temperatures.size(); i++) {
            int days = 0;
            boolean isWarmer = false;
            for (int j = i + 1; j < temperatures.size(); j++) {
                days++;
                if (temperatures.get(i) < temperatures.get(j)) {
                    isWarmer = true;
                    break;
                }
            }
            daysToWait[i] = isWarmer ? days : 0;
        }
        System.out.println(Arrays.toString(daysToWait));
    }
}
