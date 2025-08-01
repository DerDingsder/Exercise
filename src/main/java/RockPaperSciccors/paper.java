package RockPaperSciccors;

public class paper implements sign{
    //@Override
    public int compare(int ComputerSign) {
        if(ComputerSign == 0 ) return 0;
        else if(ComputerSign == 2 ) return 1;
        return -1;
    }
}
