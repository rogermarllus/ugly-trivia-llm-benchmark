import java.util.ArrayList;

public class Amostra02_MetodoAdd {

  private static final int INITIAL_CAPACITY = 6;

  private final ArrayList<String> players = new ArrayList<>();
  private final int[] places = new int[INITIAL_CAPACITY];
  private final int[] purses = new int[INITIAL_CAPACITY];
  private final boolean[] inPenaltyBox = new boolean[INITIAL_CAPACITY];

  public boolean add(String playerName) {
    addPlayerToList(playerName);
    int currentPlayerIndex = getCurrentPlayerIndex();
    initializePlayerData(currentPlayerIndex);
    printPlayerAdditionMessages(playerName, currentPlayerIndex);

    return true;
  }

  private void addPlayerToList(String playerName) {
    players.add(playerName);
  }

  private int getCurrentPlayerIndex() {
    return players.size() - 1;
  }

  private void initializePlayerData(int playerIndex) {
    places[playerIndex] = 0;
    purses[playerIndex] = 0;
    inPenaltyBox[playerIndex] = false;
  }

  private void printPlayerAdditionMessages(String playerName, int playerIndex) {
    System.out.println(playerName + " was added");
    System.out.println("They are player number " + (playerIndex + 1));
  }

  public int howManyPlayers() {
    return players.size();
  }
}
