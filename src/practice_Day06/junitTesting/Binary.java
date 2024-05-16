package practice_Day06.junitTesting;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Convert the number to binary and print it
        String binaryString = toBinary(number);
        System.out.println("Binary representation: " + binaryString);

        // Perform nibble swap and print the new number
        int swappedNumber = swapNibbles(number);
        System.out.println("Number after swapping nibbles: " + swappedNumber);

        // Check if the new number is a power of 2
        boolean isPowerOfTwo = isPowerOfTwo(swappedNumber);
        System.out.println("Is the new number a power of 2? " + isPowerOfTwo);

        scanner.close();
    }

    // Function to convert an integer to binary string
    public static String toBinary(int number) {
        return String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');
    }

    // Function to swap the nibbles of a byte
    public static int swapNibbles(int number) {
        // Mask and shift to swap the nibbles
        return ((number & 0x0F) << 4 | (number & 0xF0) >> 4);
    }

    // Function to check if a number is a power of 2
    public static boolean isPowerOfTwo(int number) {
        // A number is a power of 2 if it has only one '1' bit in its binary representation
        return number > 0 && (number & (number - 1)) == 0;
    }
}
