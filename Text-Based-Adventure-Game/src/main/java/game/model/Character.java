package game.model;

public class Character {
    private String chosenName;
    private int startingHealth;

    public Character(String name){
        this.chosenName = name;
    }

    public String getName() {
        return chosenName;
    }

    public void setName(String name) {
        this.chosenName = name;
    }
}
