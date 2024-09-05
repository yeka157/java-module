package day4;

public class Pattern {
    public void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(Math.max(0, i)));
        }
    }
}
