package practice_Day05;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        double delta = (int) Math.pow(b, 2) - 4 * a * c;
        System.out.println(delta);
        System.out.println("First Root is: " + ((int) (-b + Math.sqrt(delta)) / (2 * a)));
        System.out.println("First Root is: " + ((int) (-b - Math.sqrt(delta)) / (2 * a)));


    }
}
