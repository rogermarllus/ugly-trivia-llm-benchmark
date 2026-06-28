import java.util.ArrayList;

public class Amostra02_MetodoAdd {

    private ArrayList players;
    private int[] places;
    private int[] purses;
    private boolean[] inPenaltyBox;

    public Amostra02_MetodoAdd() {
        this.players = new ArrayList();
        this.places = new int[6];
        this.purses = new int[6];
        this.inPenaltyBox = new boolean[6];
    }

    public boolean add(String playerName) {
        if (howManyPlayers() < 6) {
            players.add(playerName);
            initializePlayer(howManyPlayers() - 1);
            printAdditionMessage(playerName);
            return true;
        }
        return false;
    }

    private void initializePlayer(int playerIndex) {
        places[playerIndex] = 0;
        purses[playerIndex] = 0;
        inPenaltyBox[playerIndex] = false;
    }

    private void printAdditionMessage(String playerName) {
        System.out.println(playerName + " was added");
        System.out.println("They are player number " + players.size());
    }

    public int howManyPlayers() {
        return players.size();
    }
}