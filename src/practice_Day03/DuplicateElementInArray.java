package practice_Day03;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {23, 4, 5634, 3, 2, 5, 5, 5622, 3, 5542, 4, 4322, 543, 32};


        int j = 0;
        while (j < arr.length) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
            j++;
        }

    }
}
