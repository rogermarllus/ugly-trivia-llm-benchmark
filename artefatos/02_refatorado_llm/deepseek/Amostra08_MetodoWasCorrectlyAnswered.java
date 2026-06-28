import java.util.ArrayList;
import java.util.List;

public class Amostra08_MetodoWasCorrectlyAnswered {

  private final List<String> players = new ArrayList<>();
  private final int[] purses = new int[6];
  private final boolean[] inPenaltyBox = new boolean[6];
  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public boolean wasCorrectlyAnswered() {
    if (isCurrentPlayerInPenaltyBox()) {
      return handlePenaltyBoxPlayer();
    } else {
      return handleRegularPlayer();
    }
  }

  private boolean isCurrentPlayerInPenaltyBox() {
    return inPenaltyBox[currentPlayer];
  }

  private boolean handlePenaltyBoxPlayer() {
    if (isGettingOutOfPenaltyBox) {
      return processCorrectAnswer();
    } else {
      moveToNextPlayer();
      return true;
    }
  }

  private boolean handleRegularPlayer() {
    return processCorrectAnswer();
  }

  private boolean processCorrectAnswer() {
    printCorrectAnswerMessage();
    increasePlayerPurse();
    printPlayerCoins();

    boolean isWinner = checkIfPlayerWon();
    moveToNextPlayer();

    return isWinner;
  }

  private void printCorrectAnswerMessage() {
    System.out.println("Answer was correct!!!!");
  }

  private void increasePlayerPurse() {
    purses[currentPlayer]++;
  }

  private void printPlayerCoins() {
    System.out.println(players.get(currentPlayer)
        + " now has "
        + purses[currentPlayer]
        + " Gold Coins.");
  }

  private boolean checkIfPlayerWon() {
    return !(purses[currentPlayer] == 6);
  }

  private void moveToNextPlayer() {
    currentPlayer++;
    if (currentPlayer == players.size()) {
      currentPlayer = 0;
    }
  }

  // --- Stub ---
  private boolean didPlayerWin() {
    return checkIfPlayerWon();
  }
}
