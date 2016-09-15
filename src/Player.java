import java.util.ArrayList;

/**
 * Created by brettgrist on 9/14/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>():


    void chooseName(){
        System.out.println("What is your name?");
        name = Game.scanner.nextLine();
        System.out.println("Welcome, " + name);
    }
    
    void chooseWeapon() throws Exception {
        System.out.println("Do you want a sword or mace?");
        weapon = Game.scanner.nextLine();

        if (weapon.equalsIgnoreCase("SWORD")) {
            System.out.println("Here's your sword!");
        } else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("Here's your mace");
        } else {
            System.out.println("weapon not recognized");
            chooseWeapon();
        }
    }

    void chooseLocation() throws Exception {
        System.out.println("Would you like to go to the tunnel or forest");
        location = Game.scanner.nextLine();

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

    void findItem(String item) {
        System.out.println("You found a " + item + "! Press y to pick up.");
        String answer = Game.scanner.nextLine():
        if (answer.equalsIgnoreCase("y")) {
            items.add(item:)
            System.out.println("You picked" + item + "up");
        }
    }


}
