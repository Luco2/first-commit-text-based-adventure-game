package user;

import gameplay.Continent;
import gameplay.Desert;
import gameplay.Island;
import gameplay.Mountain;

import java.util.Scanner;

public class UserInput extends Guide {
    private static Scanner scanner = new Scanner(System.in);

    public static void getCreateCharacter() {
        UserOutput.nameCharacter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to name your character?");
        String chosenName = scanner.nextLine();
        System.out.println("Welcome to Skylan " + chosenName);
    }
    public static void getJourney() {
        UserOutput.journey();
        String continent = Continent.getContinent();
        if (continent.equals("i")) {
            Island.getJourneyIsland();
        }
        if (continent.equals("m")) {
            Mountain.getJourneyMt();
        }
        if (continent.equals("d")) {
            Desert.getJourneyDesert();

    }
    }

    public static int getGuideOptions() {
        UserOutput.showGuideMenu();
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Inventory");
        System.out.println("J) Journey");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        if (option.equalsIgnoreCase("d")) {

            return Guide.INVENTORY;

        } else if (option.equalsIgnoreCase("j")) {

            return Guide.JOURNEY;

        } else if (option.equalsIgnoreCase("e")) {

            return Guide.EXIT;

        } else {

            return Guide.GUIDE;

        }
    }
}


