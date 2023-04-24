package user;

import gameplay.Continent;
import gameplay.InventoryFile;


public class Guide {


    public static final int GUIDE = 1;
    public static final int INVENTORY = 2;
    public static final int JOURNEY = 3;
    public static final int EXIT = 4;


    public void run() {

        int guide = GUIDE;

        /*
         * Stay in this loop until the user enters "Quit"
         */
        while (guide != EXIT) {


            if (guide == GUIDE) {

                /*
                 * Get the user selection
                 */

                guide = UserInput.getGuideOptions();

            } else if (guide == INVENTORY) {

                /*
                 * Display the hero's inventory
                 */
                InventoryFile.displayInventory();

                guide = GUIDE;

            } else if (guide == JOURNEY) {
                UserInput.getJourney();
                guide = JOURNEY;

            } else {
                UserOutput.quit();
            }
        }
    }
}