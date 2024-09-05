package day4;

import java.util.Scanner;

public class MysteryNum {
    public void mysteryNum() {
        int mystery = (int) (Math.random() * 100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        boolean guessed = false;
        int tries = 0;
        while (!guessed) {
            int guess = input.nextInt();
            tries++;
            if (guess == mystery) {
                System.out.println("Congratulations! You guessed the number");
                guessed = true;
            } else if (guess < mystery) {
                System.out.println("Your guess is too low. Try again");
            } else {
                System.out.println("Your guess is too high. Try again");
            }
        }
        System.out.println("You guessed the number in " + tries + " tries");
    }
}
