import java.util.ArrayList;
import java.util.List;

public class Amostra13_BlocoSaidaPenaltyBoxDadoImpar {

  private static final int BOARD_SIZE = 12;
  private static final int MAX_PLAYERS = 6;

  private final List<String> players = new ArrayList<>();
  private final int[] places = new int[MAX_PLAYERS];
  private final boolean[] inPenaltyBox = new boolean[MAX_PLAYERS];
  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public void rollOddWhileInPenaltyBox(int roll) {
    if (!isCurrentPlayerInPenaltyBox()) {
      return;
    }

    if (isOddRoll(roll)) {
      handleOddRollWhileInPenaltyBox(roll);
    }
  }

  private boolean isCurrentPlayerInPenaltyBox() {
    return inPenaltyBox[currentPlayer];
  }

  private boolean isOddRoll(int roll) {
    return roll % 2 != 0;
  }

  private void handleOddRollWhileInPenaltyBox(int roll) {
    isGettingOutOfPenaltyBox = true;

    announcePlayerRelease();
    updatePlayerPosition(roll);
    announceNewPosition();
    announceCategory();
    askQuestion();
  }

  private void announcePlayerRelease() {
    System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
  }

  private void updatePlayerPosition(int roll) {
    places[currentPlayer] += roll;

    if (isPositionExceedingBoard()) {
      normalizePlayerPosition();
    }
  }

  private boolean isPositionExceedingBoard() {
    return places[currentPlayer] > BOARD_SIZE - 1;
  }

  private void normalizePlayerPosition() {
    places[currentPlayer] -= BOARD_SIZE;
  }

  private void announceNewPosition() {
    System.out.println(players.get(currentPlayer) +
        "'s new location is " +
        places[currentPlayer]);
  }

  private void announceCategory() {
    System.out.println("The category is " + currentCategory());
  }

  private String currentCategory() {
    return "Rock";
  }

  private void askQuestion() {
    // stub
  }
}
