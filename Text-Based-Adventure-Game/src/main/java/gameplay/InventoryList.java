package gameplay;

import game.model.Character;

public class InventoryList {

    private String itemName;
    private int itemQuantity;

    private Character newCharacter;

    public InventoryList(String itemName, int itemQuantity) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public void Character(Character newCharacter) {
        this.newCharacter = newCharacter;
    }

    public String getItemName() {

        return itemName;
    }

    public int getItemQuantity() {

        return itemQuantity;
    }

    public void decreaseQuantity() {
        itemQuantity--;
    }
}
