package RockPaperSciccors;
import java.util.Scanner;
public class player {
    public player(){}
    public static char getSymbol() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

}
