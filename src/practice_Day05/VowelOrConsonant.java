package practice_Day05;

import java.util.Locale;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One Alphabet only: ");
        String alpha = sc.nextLine().toLowerCase(Locale.ROOT);
        if (alpha.equals("a") || alpha.equals("e") || alpha.equals("i") || alpha.equals("o") || alpha.equals("u")) {
            System.out.println(alpha + " Is a Vowel.");
        } else
            System.out.println(alpha + " Is a Consonant");
    }
}
