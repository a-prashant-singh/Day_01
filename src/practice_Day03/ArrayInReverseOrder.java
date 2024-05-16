package practice_Day03;

public class ArrayInReverseOrder {
    public static void main(String[] args) {
        int[] arr = {23, 4, 5634, 3, 2, 5, 35445, 5622, 3, 5542, 4322, 543, 32};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
