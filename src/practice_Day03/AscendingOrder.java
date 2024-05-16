package practice_Day03;

public class AscendingOrder {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void ptint(int[] arr) {
        for (int e : arr)
            System.out.println(e);
    }

    public static void main(String[] args) {
        int[] arr = {23, 4, 5634, 3, 2, 5, 35445, 5622, 3, 5542, 4322, 0, 543, 32};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        ptint(arr);

    }
}
