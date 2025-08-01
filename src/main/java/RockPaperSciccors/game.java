package RockPaperSciccors;

public class game {

    public static void main(String[] args) {
        Computer computer = new Computer();
        rock ro = new rock();
        paper pa =  new paper();
        sciccor sc = new sciccor();
        player pl = new player();
        int round = 0;
        while(round < 3) {
            System.out.println("Wähle dein Zeichen: 's' für Schere 'r' für Stein 'p' für Papier");
            char symbol = pl.getSymbol();
            int result = 0;
            switch (symbol) {
                case 's' :
                    result = sc.compare(computer.getComputerSign());
                    break;
                case 'r' :
                    result = ro.compare(computer.getComputerSign());
                    break;
                case 'p' :
                    result = pa.compare(computer.getComputerSign());
                    break;
            }
            switch (result) {
                case 0 :
                    System.out.println("Unentschieden");
                    break;
                case 1 :
                    System.out.println("Gewonnen");
                    break;
                case -1 :
                    System.out.println("Verloren");
                    break;
            }
            if(result == -1 || result == 1) round++;
        }



    }



}
