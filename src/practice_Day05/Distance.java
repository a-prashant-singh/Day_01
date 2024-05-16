package practice_Day05;

import java.util.Scanner;

public class Distance {

    private static double euclideanDistance(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        double x = sc.nextLong();
        System.out.println("Enter the value of Y: ");
        double y = sc.nextLong();

        System.out.println("The Euclidean Distance is: " + Distance.euclideanDistance(x, y));


    }
}
