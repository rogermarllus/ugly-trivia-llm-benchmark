import java.util.ArrayList;

public class Amostra02_MetodoAdd {

  ArrayList players = new ArrayList();
  int[] places = new int[6];
  int[] purses = new int[6];
  boolean[] inPenaltyBox = new boolean[6];

  public boolean add(String playerName) {
    players.add(playerName);
    int currentPlayerIndex = howManyPlayers() - 1;

    initializePlayerState(currentPlayerIndex);
    printPlayerAddedMessage(playerName, players.size());

    return true;
  }

  private void initializePlayerState(int index) {
    places[index] = 0;
    purses[index] = 0;
    inPenaltyBox[index] = false;
  }

  private void printPlayerAddedMessage(String playerName, int playerNumber) {
    System.out.println(playerName + " was added");
    System.out.println("They are player number " + playerNumber);
  }

  public int howManyPlayers() {
    return players.size();
  }
}