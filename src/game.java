import java.util.Scanner;

/**
 * Created by brettgrist on 9/14/16.
 */
public class game {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Traveler");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        System.out.println("Do you want a sword or mace?");
        String weapon = scanner.nextLine();

        if (weapon.equalsIgnoreCase("SWORD")){
            System.out.println("Here's your sword!");
        }
        else if(weapon.equalsIgnoreCase("mace")){
            System.out.println("Here's your mace");
        }
        else {
            throw new Exception("Invalid weapon.");
        }
        System.out.println("Would you like to go to the tunnel or forest");
        String location = scanner.nextLine();

        if (location.equalsIgnoreCase("tunnel")){
            System.out.println("entering tunnel");
        }
        else if (location.equalsIgnoreCase("forest")){
            System.out.println("Entering forest...");
        }
        else {
            throw new Exception("Invalid location");
        }
    }
}
