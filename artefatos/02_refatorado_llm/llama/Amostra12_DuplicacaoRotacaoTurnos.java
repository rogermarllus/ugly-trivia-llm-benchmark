import java.util.ArrayList;

public class Amostra12_DuplicacaoRotacaoTurnos {

  ArrayList players = new ArrayList();
  int[] purses = new int[6];
  boolean[] inPenaltyBox = new boolean[6];
  int currentPlayer = 0;
  boolean isGettingOutOfPenaltyBox;

  private void rotatePlayer() {
    currentPlayer = (currentPlayer + 1) % players.size();
  }

  public boolean wasCorrectlyAnswered_penaltyBoxExit() {
    boolean winner = didPlayerWin();
    rotatePlayer();
    return winner;
  }

  public boolean wasCorrectlyAnswered_penaltyBoxStay() {
    rotatePlayer();
    return true;
  }

  public boolean wasCorrectlyAnswered_normal() {
    boolean winner = didPlayerWin();
    rotatePlayer();
    return winner;
  }

  public boolean wrongAnswer() {
    inPenaltyBox[currentPlayer] = true;
    rotatePlayer();
    return true;
  }

  // --- Stub ---
  private boolean didPlayerWin() {
    return !(purses[currentPlayer] == 6);
  }
}