package practice_Day06;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
                if (sum == number) {
                    System.out.println("The number " + number + " is a perfect number.");
                }

            }
        }
    }
}
