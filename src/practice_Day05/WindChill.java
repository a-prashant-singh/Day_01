package practice_Day05;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.println("Enter the Speed in Mile per hour: ");
        double speed = sc.nextDouble();

        if (temperature < 50 && speed > 3 && speed < 120) {
            double w = (int) 35.74 + 0.6125 * temperature + (0.4275 * temperature - 35.75) * Math.pow(speed, 0.16);
            System.out.println(w);
        } else
            System.out.println("Temperature should be below 50. \nSpeed should be less then 120 and greater then 3.");
    }
}
