package practice_Day05.funtional.programs;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

    private static int[][] readIntArray(Scanner sc, int rows, int cols) {

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;

    }

    private static void printIntArray(PrintWriter writer, int[][] arr) {

        for (int[] row : arr) {
            for (int values : row) {
                // System.out.print(values+"  ");
                writer.print(values + "   ");
            }
            //System.out.println();
            writer.println();
        }

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols = sc.nextInt();

        System.out.println("Enter the Elements: ");
        int[][] arr = readIntArray(sc, rows, cols);

        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out), true);
        System.out.println("The 2D Array is: ");
        printIntArray(writer, arr);

        sc.close();
        writer.close();


    }


}
