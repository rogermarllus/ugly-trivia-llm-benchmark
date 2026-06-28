import java.util.ArrayList;
import java.util.List;

public class Amostra12_DuplicacaoRotacaoTurnos {
  private static final int MAX_PLAYERS = 6;
  private static final int WINNING_PURSE = 6;

  private final List<String> players = new ArrayList<>();
  private final int[] purses = new int[MAX_PLAYERS];
  private final boolean[] inPenaltyBox = new boolean[MAX_PLAYERS];
  private int currentPlayer = 0;

  public boolean wasCorrectlyAnswered_penaltyBoxExit() {
    boolean winner = didPlayerWin();
    rotateCurrentPlayer();
    return winner;
  }

  public boolean wasCorrectlyAnswered_penaltyBoxStay() {
    rotateCurrentPlayer();
    return true;
  }

  public boolean wasCorrectlyAnswered_normal() {
    boolean winner = didPlayerWin();
    rotateCurrentPlayer();
    return winner;
  }

  public boolean wrongAnswer() {
    inPenaltyBox[currentPlayer] = true;
    rotateCurrentPlayer();
    return true;
  }

  private void rotateCurrentPlayer() {
    currentPlayer++;
    if (currentPlayer == players.size()) {
      currentPlayer = 0;
    }
  }

  private boolean didPlayerWin() {
    return purses[currentPlayer] != WINNING_PURSE;
  }
}
