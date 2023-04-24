package gameplay;

import user.UserInput;
import user.UserOutput;

import java.util.Scanner;

public class Continent extends UserInput {
    static Scanner scanner = new Scanner(System.in);


    public static String getContinent() {
        UserOutput.chooseContinent();

        System.out.print("Please select a continent: ");
        System.out.println();
        System.out.println("I) Island of Dreary");
        System.out.println("M) Star Mountain");
        System.out.println("D) Sparse Desert");
        String selectedContinent = scanner.nextLine();
        String continent = selectedContinent.trim().toLowerCase();

        if (continent.equals("i")) {
            System.out.println("You have selected Island of Dreary. Teleporting... ");
            Island.getJourneyIsland();
        } else if (continent.equals("m")) {
            System.out.println("You have selected Star Mountain. Teleporting ... ");
            System.out.println();
            Mountain.getJourneyMt();
        } else if (continent.equals("d")) {
            System.out.println("You have selected Sparse Desert. Teleporting ... ");
        } else {
            System.out.println("Invalid selection. Please try again.");

        }
        return continent;
    }
}

