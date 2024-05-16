package practice_Day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SumOfThreeIntegersAddsToZero {

    private static void readIntArray(Scanner sc, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

   /* private static void printintArray(int[] arr) {

        for (int e : arr)
            System.out.println(e);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element to enter: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter element of the Array: ");
        readIntArray(sc, arr);
        triples(arr);
        //System.out.println("The element of the Array: ");
        //printintArray(arr);
    }

    private static void triples(int[] arr) {

        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == 0) {
                        // System.out.print("("+arr[i]+"  "+arr[j]+"  "+arr[k]+") ");
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        List<Integer> list2 = list.stream().sorted().toList();
                        // System.out.println(list2);
                        set.add(list2);
                    }
                }
            }
        }
        System.out.println(set);

    }


}
