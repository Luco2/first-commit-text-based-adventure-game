package gameplay;

import user.UserInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryFile extends UserInput {

    public static final String FILENAME = "inventory.txt";
    private int itemQuantity;
    private String itemName;

    public InventoryFile() {
        this.itemQuantity = getItemQuantity();
        this.itemName = getItemName();
    }

    public void addItemToInventory(String itemName, int quantity){
        try{
            File file = new File(FILENAME);
            FileWriter writer = new FileWriter(file, true);
            int itemQuantity = 0;
            // Read the last line of the file to get the current quantity of the item
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()){
                    String[] parts = scanner.nextLine().split("\\s*,\\s*");
                    if (parts[0].equals(itemName)){
                        itemQuantity = Integer.parseInt(parts[1]);
                    }
                }
            }

            itemQuantity = itemQuantity + (quantity);

            String entry = itemName + " x " + itemQuantity;
            writer.write(entry + "\n");

            writer.close();
        } catch (IOException e) {
            System.out.println("Error adding item.");
        }
    }
    // By passing true as the second argument to the FileWriter constructor, we tell Java to open the file in "append mode", which means that any data written to the file will be added to the end of the existing data. This ensures that we don't lose any previously stored inventory items when we add a new item to the inventory.


    public static List<InventoryList> readFile() {
        List<InventoryList> inventoryItems = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(FILENAME))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split("\\s*,\\s*");
                String itemName = parts[0];
                int itemQuantity = Integer.parseInt(parts[1]);
                inventoryItems.add(new InventoryList(itemName, itemQuantity));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inventoryItems;
    }

    public static void displayInventory(){
        List<InventoryList> inventoryItems = readFile();
        System.out.println("Inventory:  ");
        for(InventoryList item : inventoryItems){
            System.out.println(item.getItemName() + " x " + item.getItemQuantity());
        }
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

