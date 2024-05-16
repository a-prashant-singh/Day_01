package practice_Day03;

public class SecondLargestInArray {
    public static void main(String[] args) {

        int[] arr = {23, 4, 5634, 3, 2, 5, 35445, 5666, 3, 5542, 4322, 543, 32};
        int max = 0;
        for (int e : arr) {
            if (e > max)
                max = e;
        }
        int secondMax = 0;
        for (int e : arr) {
            if (e > secondMax && e < max) {
                secondMax = e;
            }
        }
        System.out.println(secondMax);

    }
}
