package day3;

public class SecondSmallest {
    public int secondSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int j : array) {
            if (j < smallest) {
                secondSmallest = smallest;
                smallest = j;
            } else if (j < secondSmallest && j != smallest) {
                secondSmallest = j;
            }
        }

        return secondSmallest;
    }
}
