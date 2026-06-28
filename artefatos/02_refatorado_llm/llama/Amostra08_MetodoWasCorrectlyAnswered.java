import java.util.ArrayList;

public class Amostra08_MetodoWasCorrectlyAnswered {

  private ArrayList players = new ArrayList();
  private int[] purses = new int[6];
  private boolean[] inPenaltyBox = new boolean[6];
  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public boolean wasCorrectlyAnswered() {
    if (isPlayerInPenaltyBox()) {
      return handlePenaltyBox();
    } else {
      return handleNormalPlay();
    }
  }

  private boolean isPlayerInPenaltyBox() {
    return inPenaltyBox[currentPlayer];
  }

  private boolean handlePenaltyBox() {
    if (isGettingOutOfPenaltyBox) {
      return handleCorrectAnswerInPenaltyBox();
    } else {
      return handleIncorrectAnswerInPenaltyBox();
    }
  }

  private boolean handleNormalPlay() {
    return handleCorrectAnswer();
  }

  private boolean handleCorrectAnswerInPenaltyBox() {
    System.out.println("Answer was correct!!!!");
    purses[currentPlayer]++;
    System.out.println(players.get(currentPlayer) + " now has " + purses[currentPlayer] + " Gold Coins.");
    return checkForWinnerAndAdvancePlayer();
  }

  private boolean handleIncorrectAnswerInPenaltyBox() {
    advancePlayer();
    return true;
  }

  private boolean handleCorrectAnswer() {
    System.out.println("Answer was corrent!!!!");
    purses[currentPlayer]++;
    System.out.println(players.get(currentPlayer) + " now has " + purses[currentPlayer] + " Gold Coins.");
    return checkForWinnerAndAdvancePlayer();
  }

  private boolean checkForWinnerAndAdvancePlayer() {
    boolean winner = didPlayerWin();
    advancePlayer();
    return winner;
  }

  private void advancePlayer() {
    currentPlayer = (currentPlayer + 1) % players.size();
  }

  // --- Stub ---
  private boolean didPlayerWin() {
    return !(purses[currentPlayer] == 6);
  }
}