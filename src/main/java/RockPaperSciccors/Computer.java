package RockPaperSciccors;
import java.util.Random;

public class Computer {
    public Computer() {}
    Random random = new Random();
    int getComputerSign() {
        return random.nextInt(3);
    }



}
