package game;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class SnackAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> snake= new HashMap<>();

        snake.put(17, 7);
        snake.put(54, 34);
        snake.put(62, 19);
        snake.put(64, 60);
        snake.put(87, 36);
        snake.put(92, 73);
        snake.put(95, 75);
        snake.put(98, 79);

        HashMap<Integer, Integer> ladder = new HashMap<>();

        ladder.put(4, 14);
        ladder.put(9, 31);
        ladder.put(21, 59);
        ladder.put(28, 84);
        ladder.put(51, 67);
        ladder.put(72, 91);
        ladder.put(80, 99);
        ladder.put(41, 78);


        Random d = new Random();
        int position = 1;
        int die;
        String play;
        int count = 0;
        int currentPosition;

        while (position < 100) {
            System.out.println("Your position is : " + position);
            System.out.println("Press enter to roll the die: ");
            play = sc.nextLine();
            count++;

            if (play.isEmpty()) {

                die = d.nextInt(6) + 1;
                currentPosition = position + die;

                if (currentPosition > 100)
                    currentPosition -= die;

                System.out.println("Your Die : " + die);
                System.out.println("Previous position : " + currentPosition);
                position += die;

                if (snake.containsKey(position)) {
                    position = snake.get(position);
                    System.out.println("You have been bite by snake and your new position is: " + position);

                } else if (ladder.containsKey(position)) {
                    position = ladder.get(position);

                    System.out.println("You have got ladder and your new position is: " + position);

                } else if (position == 100) {
                    System.out.println("Congrats you have Won the Game. ");
                } else if (position > 100) {
                    position -= die;
                    System.out.println("To win you want " + (100 - position));
                }
            } else {
                System.out.println("press Enter only");
            }


        }
        System.out.println("you have played " + count + " moves to win the game.");
    }
}
