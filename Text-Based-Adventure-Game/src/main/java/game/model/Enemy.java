package game.model;

public class Enemy extends Character implements CanAct{

    public Enemy(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("Generic enemy attacking!!");
    }
}
