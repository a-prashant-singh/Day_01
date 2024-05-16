package practice_Day06.junitTesting;

import java.util.Scanner;

public class TemperatureConversion {

    public static float temperatureConversion(float temp, float degree)
    {
        if(degree==0)
            return ((temp * 9) /5) + 32;
        else
            return  ((temp - 32) * 5) /9;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        float temp=sc.nextInt();
        System.out.println("Press 0 for Celsius or Press 1 for Fahrenheit : ");
        float degree=sc.nextInt();

        if (degree==0)
            System.out.println("Your "+temp+" is converted to "+temperatureConversion(temp,degree)+"°F");
        else
            System.out.println("Your "+temp+" is converted to "+temperatureConversion(temp,degree)+"°C");



    }
}
