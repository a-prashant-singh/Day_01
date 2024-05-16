package practice_Day03;

public class SmallestElementInArray {
    public static void main(String[] args) {

        int[] arr = {1, 4, 0, 3, 2, 5, 35445, 5622, 3, 5542, 4322, 543, 32};

        int min = arr[0];
        for (int e : arr) {
            if (min > e)
                min = e;
        }
        System.out.println(min);
    }
}
