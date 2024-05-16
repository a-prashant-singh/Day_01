package practice_Day05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoinFlipPercentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip coin: ");
        int coin = sc.nextInt();
        int tails = 0, heads = 0;

        for (int i = 0; i < coin; i++) {

            double random = Math.random();
            float headOrTails = Float.parseFloat(String.format("%.1f", random));
            if (headOrTails < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double headsPercentage = ((double) heads / coin) * 100;
        double tailsPercentage = ((double) tails / coin) * 100;
        DecimalFormat df = new DecimalFormat("0.00");
        String headsFormattedPercentage = df.format(headsPercentage);
        String tailsFormattedPercentage = df.format(tailsPercentage);

        System.out.println("Number of heads : " + heads + "  Number of Tails : " + tails);
        System.out.println("Percentage of Heads: " + headsFormattedPercentage + "%" + "  Percentage of tails: " + tailsFormattedPercentage + "%");

    }

}
