package RockPaperSciccors;

public class rock implements sign {
    public rock() {}
    //@Override
    public int compare(int ComputerSign) {
        if(ComputerSign == 2 ) return 0;
        else if(ComputerSign == 1 ) return 1;
        return -1;
    }
}
