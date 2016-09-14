import java.util.Scanner;

/**
 * Created by brettgrist on 9/14/16.
 */
public class game {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Traveler");


        player player = new player();
        player.chooseName();
        player.chooseWeapon();
    }
}
