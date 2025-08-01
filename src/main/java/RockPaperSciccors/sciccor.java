package RockPaperSciccors;

public class sciccor implements sign {
    public sciccor(){}
    //@Override
    public int compare(int ComputerSign) {
        if (ComputerSign == 1 ) return 0;
        else if (ComputerSign == 0 ) return 1;
        return -1;
    }
}
