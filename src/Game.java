import java.util.Scanner;

/**
 * Created by brettgrist on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Traveler");

        boolean keepRunning = true;


        while (keepRunning) {
            Player player = new Player();
            player.chooseName();
            player.chooseWeapon();
            player.chooseLocation();

            System.out.println("You win!");
            System.out.println("Would you like to play again? Type y or n");

            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                keepRunning = false;
            }
        }

        System.out.println("Game Over");
    }
}