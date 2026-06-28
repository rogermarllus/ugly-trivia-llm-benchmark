import java.util.ArrayList;
import java.util.List;

public class Amostra14_BlocoRetencaoPenaltyBoxDadoPar {
  private static final int MAX_PLAYERS = 6;

  private final List<String> players;
  private final boolean[] inPenaltyBox;
  private int currentPlayer;
  private boolean isGettingOutOfPenaltyBox;

  public Amostra14_BlocoRetencaoPenaltyBoxDadoPar() {
    this.players = new ArrayList<>();
    this.inPenaltyBox = new boolean[MAX_PLAYERS];
    this.currentPlayer = 0;
    this.isGettingOutOfPenaltyBox = false;
  }

  public void rollEvenWhileInPenaltyBox(int roll) {
    if (isCurrentPlayerInPenaltyBox()) {
      handlePenaltyBoxRoll(roll);
    }
  }

  private boolean isCurrentPlayerInPenaltyBox() {
    return inPenaltyBox[currentPlayer];
  }

  private void handlePenaltyBoxRoll(int roll) {
    if (isOddRoll(roll)) {
      handleOddRoll();
    } else {
      handleEvenRoll();
    }
  }

  private boolean isOddRoll(int roll) {
    return roll % 2 != 0;
  }

  private void handleOddRoll() {
    isGettingOutOfPenaltyBox = true;
    // jogador sai — tratado em outra amostra
  }

  private void handleEvenRoll() {
    String playerName = players.get(currentPlayer);
    System.out.println(playerName + " is not getting out of the penalty box");
    isGettingOutOfPenaltyBox = false;
  }

  // Getters and setters for encapsulation
  public List<String> getPlayers() {
    return new ArrayList<>(players);
  }

  public void addPlayer(String player) {
    if (players.size() < MAX_PLAYERS) {
      players.add(player);
    }
  }

  public void setCurrentPlayerInPenaltyBox(int playerIndex, boolean inPenalty) {
    if (isValidPlayerIndex(playerIndex)) {
      inPenaltyBox[playerIndex] = inPenalty;
    }
  }

  public int getCurrentPlayer() {
    return currentPlayer;
  }

  public void setCurrentPlayer(int playerIndex) {
    if (isValidPlayerIndex(playerIndex)) {
      currentPlayer = playerIndex;
    }
  }

  public boolean isGettingOutOfPenaltyBox() {
    return isGettingOutOfPenaltyBox;
  }

  private boolean isValidPlayerIndex(int index) {
    return index >= 0 && index < MAX_PLAYERS;
  }
}
