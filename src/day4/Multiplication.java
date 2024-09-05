package day4;

public class Multiplication {
    public void multiplication(int number) {
        for (int i = 1; i <= number; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 1; j <= number; j++) {
                str.append(i * j).append(" ");
            }
            System.out.println(str);
        }
    }
}
