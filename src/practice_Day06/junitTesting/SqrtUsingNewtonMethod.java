package practice_Day06.junitTesting;

import java.util.Scanner;

public class SqrtUsingNewtonMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the non-Negetive number : ");
        int num = sc.nextInt();

        System.out.println(toBinary(num));

        //System.out.println(sqrtOfNumber(num));

    }
    public static String toBinary(int n) {
        StringBuilder binary = new StringBuilder();

        // Check for negative numbers and handle accordingly
        if (n < 0) {
            n &= 0xFFFFFFFF;
        }

        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;
            binary.append((n & mask) != 0 ? "1" : "0");
        }

        return binary.toString();
    }
    /*private static double sqrtOfNumber(int num) {
            if (num == 0) {
                return 0;
            }

            double epsilon = 1e-15;
            double t = num;

            while (Math.abs(t - num / t) > epsilon * t) {
                t = (num / t + t) / 2.0;
            }
            return t;
    }
*/
}
