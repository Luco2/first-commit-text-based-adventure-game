import gameplay.Continent;
import user.Guide;
import user.UserInput;

public class Main {

    public static void main(String[] args) {
       // create object in driver class for user input (through guide menu)
        UserInput.getCreateCharacter();
        Guide guide = new Guide();
        guide.run();

    }
}
