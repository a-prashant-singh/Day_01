package practice_Day05;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        if (year > 1582) {
            if (year % 100 == 0 && year % 400 == 0)
                System.out.println(year + " is a Leap year. ");
            else if (year % 4 == 0 && year % 100 != 0)
                System.out.println(year + " is a Leap year. ");
            else
                System.out.println(year + " is not a Leap year. ");
        } else
            System.out.println("Please enter year greater then 1582");

    }
}
