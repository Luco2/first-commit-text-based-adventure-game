package gameplay;

import user.UserInput;
import user.UserOutput;

import java.util.Scanner;

public class Mountain {

    static Scanner scanner = new Scanner(System.in);

    public static String getJourneyMt() {
        String journeyStart = scanner.nextLine();
        String journey = journeyStart.toLowerCase();
        if (journey.equals("m")) {
            System.out.println("Before you is a magnificent mountain. The tallest you've ever seen. It is heard that at the top of that mountain is the answer to all your problems... Shall you venture?");
            System.out.println("Y) Yes");
            System.out.println("N) No");
            System.out.println("C) Consult wise guide.");
            String chooseMountain = scanner.nextLine();
            String choiceM = chooseMountain.toLowerCase();
            if (choiceM.equalsIgnoreCase("y")) {
                System.out.println("You travel as far as you can until your unexpected weariness becomes. Fortunately there is a trusty steed in the distance. Would you like to tame the wild horse?");
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
                System.out.println("Would you like to consult the guide or end you're adventure?");
                System.out.println("C) Consult guide.");
                System.out.println("Q) Quit game.");
                String choice = scanner.nextLine();
                String c = choice.toLowerCase();
                if (c.equalsIgnoreCase("c")){
                    UserInput.getGuideOptions();
                } if (c.equalsIgnoreCase("q")){
                    UserOutput.quit();
                }
            }
        }
        return journeyStart;
    }

}
