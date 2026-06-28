import java.util.ArrayList;

public class Amostra08_MetodoWasCorrectlyAnswered {

  ArrayList players = new ArrayList();
  int[] purses = new int[6];
  boolean[] inPenaltyBox = new boolean[6];
  int currentPlayer = 0;
  boolean isGettingOutOfPenaltyBox;

  public boolean wasCorrectlyAnswered() {
    if (inPenaltyBox[currentPlayer]) {
      if (isGettingOutOfPenaltyBox) {
        handleCorrectAnswerWhileInPenaltyBox();
      } else {
        advanceCurrentPlayer();
        return true;
      }
    } else {
      handleCorrectAnswer();
    }

    boolean winner = didPlayerWin();
    advanceCurrentPlayer();
    return winner;
  }

  private void handleCorrectAnswerWhileInPenaltyBox() {
    System.out.println("Answer was correct!!!!");
    purses[currentPlayer]++;
    System.out.println(players.get(currentPlayer)
        + " now has "
        + purses[currentPlayer]
        + " Gold Coins.");
  }

  private void handleCorrectAnswer() {
    System.out.println("Answer was corrent!!!!");
    purses[currentPlayer]++;
    System.out.println(players.get(currentPlayer)
        + " now has "
        + purses[currentPlayer]
        + " Gold Coins.");
  }

  private void advanceCurrentPlayer() {
    currentPlayer++;
    if (currentPlayer == players.size())
      currentPlayer = 0;
  }

  // --- Stub ---
  private boolean didPlayerWin() {
    return !(purses[currentPlayer] == 6);
  }
}