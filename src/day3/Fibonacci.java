package day3;

public class Fibonacci {
    public int[] fibonacci(int number) {
        int[] fib = new int[number];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < number; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
