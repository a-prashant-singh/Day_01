package practice_Day06;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumber {

    // Function to generate a random number between 0 and N-1
    public static int generateRandomNumber(int N) {
        Random random = new Random();

        return random.nextInt(N);
    }

    // Function to count the number of random numbers needed to collect all coupons
    public static int collectCoupons(int N) {
        Set<Integer> collectedCoupons = new HashSet<>();
        int totalRandomNumbers = 0;

        // Loop until we collect all N distinct coupons
        while (collectedCoupons.size() < N) {
            int coupon = generateRandomNumber(N);
            totalRandomNumbers++;
            collectedCoupons.add(coupon);
        }
        System.out.println(collectedCoupons);

        return totalRandomNumbers;
    }

    public static void main(String[] args) {
        int N; // Example input, number of distinct coupons
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of coupon to generate: ");
        N=sc.nextInt();
        int totalRandomNumbers = collectCoupons(N);

        System.out.println("Total random numbers needed to collect all " + N + " distinct coupons: " + totalRandomNumbers);
    }
}
