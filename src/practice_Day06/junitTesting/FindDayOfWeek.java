package practice_Day06.junitTesting;

import java.util.Scanner;

public class FindDayOfWeek {

    public int dayOfWeek(int year, int month, int date)
    {
        int y0 = year-(14-month)/12;
        int  x = y0 + y0/4-y0/100 + y0/400;
        int  m0 = month + 12*x*((14 - month) / 12) - 2;

        return (date + x + 31*m0/12)% 7;
    }

    public static void main(String[] args) {

        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date : ");
        int date=sc.nextInt();
        System.out.println("Enter month : ");
        int month=sc.nextInt();
        System.out.println("Enter year : ");
        int year=sc.nextInt();


        int day=new FindDayOfWeek().dayOfWeek(year,month,date);

        System.out.println("The Day of the Date is : "+days[day]);
    }
}
