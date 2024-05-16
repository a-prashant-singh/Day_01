package practice_Day03;

public class OddPositionOfElementInArray {
    public static void main(String[] args) {

        int[] arr = {23, 4, 5634, 3, 2, 5, 35445, 5622, 3, 5542, 4322, 543, 32};

        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);

        }
    }
}
