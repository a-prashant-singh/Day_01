package practice_Day06;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. till fibonacci Series will print: ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1, sum;
        System.out.print("The Fibbonacci Series is: " + n1);

        for (int i = 0; i < n - 2; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(" " + sum);
        }

    }
}
