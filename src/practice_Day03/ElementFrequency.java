package practice_Day03;

import java.util.HashMap;

public class ElementFrequency {

    public static void main(String[] args) {

        int[] arr = {46, 346, 345, 345, 46, 334, 45, 43, 334, 46};

        var freq = new HashMap<Integer,Integer>();

        for (int a : arr) {
            freq.put(a, freq.getOrDefault(a, 0) + 1);
            System.out.println(a + " : " + freq.getOrDefault(a, 222));
        }
        System.out.println(freq);

        System.out.println(freq.getOrDefault(48, 333));


    }
}
