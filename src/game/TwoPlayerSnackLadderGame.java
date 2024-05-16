package game;

import java.util.*;

public class TwoPlayerSnackLadderGame {


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

        System.out.println("Enter the name of the 1st player : ");
        String player1=sc.nextLine();
        System.out.println("Enter the name of the 2nd player : ");
        String player2=sc.nextLine();
        System.out.println("================================================================================");
        System.out.println("Lets start the game...");


        int player1position = 1;
        int player2position = 1;


        while (player1position<100 && player2position<100){
            System.out.println(player1+"'s position is : "+player1position);
            System.out.println(player2+"'s position is : "+player2position);
            if(player1position<100 && player2position<100) {
                System.out.println("================================================================================");
                System.out.println(player1+"'s Turn: ");
                player1position = playSnakeAndladder(player1position,snake,ladder,player1);
                System.out.println("================================================================================");
                System.out.println(player2+"'s Turn: ");
                player2position = playSnakeAndladder(player2position,snake,ladder,player2);
                System.out.println("================================================================================");

            }
            else {
                System.out.println("Game is Over.........." +
                        "");
            }

        }
    }


    public static int playSnakeAndladder(int playerPosition,HashMap snake,HashMap ladder, String player) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int position = playerPosition;
        int die;
        String play;
        //int count = 0;
        int currentPosition = 0;

            System.out.println(player+"'s previous position is : " + position);
            System.out.println("Press enter to roll the die: ");
            play = sc.nextLine();
          //  count++;

            if (play.isEmpty()) {

                die = random.nextInt(6) + 1;
                currentPosition = position + die;

                if (currentPosition > 100)
                    currentPosition -= die;

                System.out.println(player+" has roll the Die : " + die);
                System.out.println(player+"'s new position : " + currentPosition);
                position += die;

                if (snake.containsKey(position)) {
                    position = (int) snake.get(position);
                    System.out.println(player+" has been bite by snake and your new position is: " + position);

                } else if (ladder.containsKey(position)) {
                    position = (int) ladder.get(position);

                    System.out.println(player+" has got ladder and your new position is: " + position);
                    playSnakeAndladder(position,snake,ladder,player);
                } else if (position == 100) {
                   // status=true;
                    System.out.println("Congrats "+player+" has Won the Game. ");
                    return position;
                } else if (position > 100) {
                    position -= die;
                    System.out.println("To win "+player+" need : " + (100 - position));
                }
            } else {
                System.out.println("press Enter only");
            }


return position;
    }
}
