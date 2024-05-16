package practice_Day06;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc=new Scanner(System.in);
        System.out.println("Press Enter to start the stopwatch: ");
        sc.nextLine();
        long startTime=System.currentTimeMillis();
        System.out.println("StopWatch has started....");
        System.out.println("Press Enter to end the stopwatch: ");
        sc.nextLine();
        long endTime=System.currentTimeMillis();
        System.out.println("Elapsed time between start and end in microsecond: "+(startTime-endTime));


    }
}
