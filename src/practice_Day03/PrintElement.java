package practice_Day03;

import java.util.Arrays;

public class PrintElement {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 3, 32, 43, 2, 67, 90, 86};


        Arrays.stream(arr).forEach(System.out::println);
    }


}
