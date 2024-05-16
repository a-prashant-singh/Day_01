package practice_Day05;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        /*EvenOrOdd a=new EvenOrOdd();
        System.out.println(a.addi(2,9));*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is Even.");
        else
            System.out.println(number + " is Odd. ");
    }

    public float addi(int a, float b) {
        return a + b;
    }

    /*public float addi(int a,int b)
     {
         return a*b;
     }
    */
   /* public float addi(float a, float b) {
        return a * b * 2;
    }*/

    /*public float addi(float a, int b) {
        return a * b * 4;
    }*/
}
