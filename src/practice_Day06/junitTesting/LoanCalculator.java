package practice_Day06.junitTesting;

import java.util.Scanner;
public class LoanCalculator {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the principle Amount : ");
        double principal = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the years of loan : ");
        double years = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the Anual Interest Rate :");
        double annualInterestRate = Double.parseDouble(sc.nextLine());

        double payment = monthlyPayment(principal, years, annualInterestRate);
        System.out.printf("The monthly payment is: %.2f%n", payment);
    }

    public static double monthlyPayment(double principal, double years, double annualInterestRate) {
        double n = 12 * years;
        double r = annualInterestRate / (12 * 100);

        return (principal * r) / (1 - Math.pow(1 + r, -n));
    }
}
