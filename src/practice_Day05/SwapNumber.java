package practice_Day05;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Before Swap: ");
        System.out.println("First Number: " + firstNumber + " Second Number: " + secondNumber);
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After Swap: ");
        System.out.println("First Number: " + firstNumber + " Second Number: " + secondNumber);
    }
}
