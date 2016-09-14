import java.util.Scanner;

/**
 * Created by brettgrist on 9/14/16.
 */
public class player {
    String name;
    String weapon;
    String location;

    void chooseName(){
        System.out.println("What is your name?");
        name = game.scanner.nextLine();
        System.out.println("Welcome, " + name);
    }
    
        chooseWeapon() throws Exception {
        System.out.println("Do you want a sword or mace?");
        weapon = game.scanner.nextLine();

        if (weapon.equalsIgnoreCase("SWORD")){
            System.out.println("Here's your sword!");
        }
        else if(weapon.equalsIgnoreCase("mace")){
            System.out.println("Here's your mace");
        }
        else {
            System.out.println("weapon not recognized");
            chooseWeapon();
        }

        System.out.println("Would you like to go to the tunnel or forest");
            location = location.scanner.nextLine();

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
