package day3;

public class BubbleSort {
    public String[] bubbleSort(String[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Integer.parseInt(array[j - 1]) > Integer.parseInt(array[j])) {
                    temp = Integer.parseInt(array[j - 1]);
                    array[j - 1] = array[j];
                    array[j] = String.valueOf(temp);
                }
            }
        }
        return array;
    }
}
