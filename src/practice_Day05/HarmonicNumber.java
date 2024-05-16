package practice_Day05;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        float h = 0;
        for (int i = 1; i <= number; i++) {
            h += 1.0f / i;
        }
        System.out.println(h);
    }
}
