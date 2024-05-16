package practice_Day05;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int dividend = sc.nextInt();

        System.out.println("Enter the divisor : ");

        int divisor = sc.nextInt();

        System.out.println("Quotient :" + dividend / divisor);
        System.out.println("Remainder: " + dividend % divisor);


    }
}
