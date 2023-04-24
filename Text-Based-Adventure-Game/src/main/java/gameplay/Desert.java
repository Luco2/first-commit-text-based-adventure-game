package gameplay;

import user.UserInput;

import java.util.List;
import java.util.Scanner;

public class Desert extends UserInput {

    static Scanner scanner = new Scanner(System.in);

    public static String getJourneyDesert() {
            System.out.println("You find yourself in front of a magnificent golden hill, but the sand below your feet burns. Would you like to open your inventory?");
            System.out.println("Y) Yes");
            System.out.println("N) No");
            System.out.println("C) Consult wise guide.");
            String chooseDesert = scanner.nextLine();
            String choiceD = chooseDesert.toLowerCase();

            if (choiceD.equalsIgnoreCase("y")) {
                // TODO add if statements for what they select from inventory (gonna have to use printwriter)
                System.out.println();
                System.out.println("What would you like to select?");
                List<InventoryList> inventory = InventoryFile.readFile();
                // TODO know .. make for loop so we can create a variable for the item they choose and go down the line in the file
                for (int i = 0; i < inventory.size(); i++) {
                    InventoryList item = inventory.get(i);
                    String itemName = item.getItemName();
                    int itemQuantity = item.getItemQuantity();
                    System.out.println((i + 1) + ". " + itemName + " x " + itemQuantity);
                }
                // TODO know that itemNumber is the variable created for what the user inputs
                int itemNumber = scanner.nextInt();
                if (itemNumber < 1 || itemNumber > inventory.size()) {
                    System.out.println("Item does not exist in your inventory.");
                } else {
                    InventoryList item = inventory.get(itemNumber);
                    item.decreaseQuantity();
                }

            }
            if (choiceD.equalsIgnoreCase("n")) {
                System.out.println("It seems your feet have been burned too much and your no longer able to walk. Fortunately you see a steed ahead. Do you crawl to the friendly looking camel?");
                System.out.println("Y) Yes");
                System.out.println("N) No");
                System.out.println("C) Consult wise guide.");
                String chooseCamel = scanner.nextLine();
                String camel = chooseCamel.toLowerCase();

                if (camel.equalsIgnoreCase("y")) {
                    System.out.println("The camel has accepted you as his master. You may now travel far distances. Where would you like to go?");
                    System.out.println("N) North");
                    System.out.println("S) South");
                    System.out.println("C) Consult wise guide.");
                    String chooseDirection = scanner.nextLine();
                    String direction = chooseDirection.toLowerCase();

                    if (camel.equalsIgnoreCase("n")) {
                        System.out.println("You leave the camel and decide to spend the night here. You are awoken by a growling.");
                        // TODO add enemy health and name
                        System.out.println("You have encountered an enemy: ");

                        System.out.println("A) Attack");
                        System.out.println("R) Run");
                    }
                    if (direction.equalsIgnoreCase("n")) {
                        System.out.println("After some distance you decide to rest, but are woken up by a loud clanking of metal. You wander over thinking it's someone making bad music.");
                        System.out.println("*********************************************************");
                        // TODO add enemy health and name
                        System.out.println("You have come across an enemy. Enemy health level: ");
                    } if (direction.equalsIgnoreCase("s")) {
                        System.out.println("After some distance you decide to rest, but are woken up by a loud clanking of metal. You wander over thinking it's someone making bad music.");
                        System.out.println("*********************************************************");
                        // TODO add enemy health and name
                        System.out.println("You have come across an enemy. Enemy health level: ");
                    }
                }
            }

        return chooseDesert;
    }
}
