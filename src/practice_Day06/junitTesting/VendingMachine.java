package practice_Day06.junitTesting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer> note=new HashMap<>();
        note.put(1,0);
        note.put(2,0);
        note.put(5,0);
        note.put(10,0);
        note.put(50,0);
        note.put(100,0);
        note.put(500,0);
        note.put(1000,0);


        System.out.println("Enter the amount to return from vending machine: ");
        int change=sc.nextInt();
    int count=0;
        while(change!=0) {
            if (change >= 1000) {
                change -= 1000;
                count++;
                note.put(1000,note.getOrDefault(1000,0)+1);
            } else if (change >= 500) {
                change -= 500;
                count++;
                note.put(500,note.getOrDefault(500,0)+1);

            } else if (change >= 100) {
                change -= 100;
                count++;
                note.put(100,note.getOrDefault(100,0)+1);

            } else if (change >= 50) {
                change -= 50;
                count++;
                note.put(50,note.getOrDefault(50,0)+1);

            } else if (change >= 10) {
                change -= 10;
                count++;
                note.put(10,note.getOrDefault(10,0)+1);

            } else if (change >= 5) {
                change -= 5;
                count++;
                note.put(5,note.getOrDefault(5,0)+1);

            } else if (change >= 2) {
                change -= 2;
                count++;
                note.put(2,note.getOrDefault(2,0)+1);

            } else if (change >= 1) {
                change -= 1;
                count++;
                note.put(1,note.getOrDefault(1,0)+1);

            }
        }
        System.out.println(count+"  "+change+" "+note);
    }
}
