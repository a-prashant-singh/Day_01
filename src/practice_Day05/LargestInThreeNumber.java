package practice_Day05;

import java.util.Scanner;

public class LargestInThreeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstnumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = sc.nextInt();

        if (firstnumber > secondNumber) {
            if (firstnumber > thirdNumber)
                System.out.println("The largest number is: " + firstnumber);
        } else if (secondNumber > thirdNumber)
            System.out.println("The largest number is: " + secondNumber);
        else
            System.out.println("The largest number is : " + thirdNumber);
    }
}
