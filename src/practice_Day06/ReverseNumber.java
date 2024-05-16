package practice_Day06;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for reverse: ");
        int rev = 0,num=sc.nextInt();

        while(num!=0)
        {
            int d=num%10;
            num /= 10;
            rev=rev*10+d;
        }
        System.out.println(rev);
           }
}
