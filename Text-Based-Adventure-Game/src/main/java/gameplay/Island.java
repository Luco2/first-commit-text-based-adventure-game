package gameplay;

import user.UserInput;

import java.util.Scanner;



public class Island extends UserInput {

    static Scanner scanner = new Scanner(System.in);

    public static String getJourneyIsland() {
        System.out.println("Land ho! Ahead is a white sand beach. You're ship is headed that way...Once you arrive you notice a path with empty bottles of rum and weird little metal objects that turn out to be dread rings. Do you choose to follow the path?");
        System.out.println("Y) Yes");
        System.out.println("N) No");
        String chooseMountain = scanner.nextLine();
        String choiceM = chooseMountain.toLowerCase();
        if (choiceM.equalsIgnoreCase("y")) {
            System.out.println("");
            System.out.println("Y) Yes");
            System.out.println("N) No");
            String chooseHorse = scanner.nextLine();
            String horse = chooseHorse.toLowerCase();
            if (horse.equalsIgnoreCase("y")) {
                System.out.println("The wild horse is untamable!");
                // TODO add enemy health and name
                System.out.println("You have encountered an enemy: ");
                System.out.println("A) Attack");
                System.out.println("B) Run");
            }
        }
        if (choiceM.equalsIgnoreCase("n")) {


        }
        return chooseMountain;
    }
}

