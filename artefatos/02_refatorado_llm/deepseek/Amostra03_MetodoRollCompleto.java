import java.util.ArrayList;
import java.util.List;

public class Amostra03_MetodoRollCompleto {

  private static final int BOARD_SIZE = 12;
  private static final int MAX_PLAYERS = 6;

  private final List<String> players = new ArrayList<>();
  private final int[] places = new int[MAX_PLAYERS];
  private final boolean[] inPenaltyBox = new boolean[MAX_PLAYERS];

  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public void roll(int roll) {
    printRollInformation(roll);

    if (isPlayerInPenaltyBox()) {
      handlePenaltyBoxRoll(roll);
    } else {
      handleNormalRoll(roll);
    }
  }

  private void printRollInformation(int roll) {
    System.out.println(players.get(currentPlayer) + " is the current player");
    System.out.println("They have rolled a " + roll);
  }

  private boolean isPlayerInPenaltyBox() {
    return inPenaltyBox[currentPlayer];
  }

  private void handlePenaltyBoxRoll(int roll) {
    if (isOddRoll(roll)) {
      processSuccessfulPenaltyExit(roll);
    } else {
      processFailedPenaltyExit();
    }
  }

  private boolean isOddRoll(int roll) {
    return roll % 2 != 0;
  }

  private void processSuccessfulPenaltyExit(int roll) {
    isGettingOutOfPenaltyBox = true;
    System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
    updatePlayerPosition(roll);
    printPositionAndCategory();
    askQuestion();
  }

  private void processFailedPenaltyExit() {
    System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
    isGettingOutOfPenaltyBox = false;
  }

  private void handleNormalRoll(int roll) {
    updatePlayerPosition(roll);
    printPositionAndCategory();
    askQuestion();
  }

  private void updatePlayerPosition(int roll) {
    places[currentPlayer] = calculateNewPosition(places[currentPlayer], roll);
  }

  private int calculateNewPosition(int currentPosition, int roll) {
    int newPosition = currentPosition + roll;
    return normalizePosition(newPosition);
  }

  private int normalizePosition(int position) {
    if (position > BOARD_SIZE - 1) {
      return position - BOARD_SIZE;
    }
    return position;
  }

  private void printPositionAndCategory() {
    System.out.println(players.get(currentPlayer)
        + "'s new location is "
        + places[currentPlayer]);
    System.out.println("The category is " + currentCategory());
  }

  // --- Stubs ---
  private String currentCategory() {
    return "Rock";
  }

  private void askQuestion() {
    // stub
  }
}
