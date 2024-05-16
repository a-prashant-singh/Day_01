package practice_Day05;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            System.out.println(Math.pow(2, i));

        }
    }
}
