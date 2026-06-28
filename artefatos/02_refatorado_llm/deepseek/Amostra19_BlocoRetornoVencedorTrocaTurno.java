import java.util.ArrayList;
import java.util.List;

public class Amostra19_BlocoRetornoVencedorTrocaTurno {
  private final List<String> players = new ArrayList<>();
  private final int[] purses = new int[6];
  private int currentPlayer = 0;

  public boolean resolveWinnerAndRotate_penaltyBoxExit() {
    return processTurn();
  }

  public boolean resolveWinnerAndRotate_normal() {
    return processTurn();
  }

  private boolean processTurn() {
    boolean winner = didPlayerWin();
    advanceToNextPlayer();
    return winner;
  }

  private void advanceToNextPlayer() {
    currentPlayer++;
    if (currentPlayer == players.size()) {
      currentPlayer = 0;
    }
  }

  private boolean didPlayerWin() {
    return purses[currentPlayer] != 6;
  }
}
