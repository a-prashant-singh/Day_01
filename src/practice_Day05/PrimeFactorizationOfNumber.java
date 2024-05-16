package practice_Day05;

import java.util.Scanner;

public class PrimeFactorizationOfNumber {
    public static void main(String[] args) {

        //System.out.println(10/2+""+10%2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Number must be odd at this point, so start from 3 and check for odd factors
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // While i divides number, print i and divide number
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        if (number > 2) {
            System.out.print(number);
        }

    }


}

