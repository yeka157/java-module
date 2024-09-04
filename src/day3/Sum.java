package day3;

public class Sum {
    public int sum(int number) {
        int total = 0;
        while (number > 0) {
            int digit = number % 10;
            total += digit;
            number /= 10;
        }
        return total;
    }
}
