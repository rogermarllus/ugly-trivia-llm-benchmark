import java.util.ArrayList;

public class Amostra19_BlocoRetornoVencedorTrocaTurno {

  private ArrayList players = new ArrayList();
  private int[] purses = new int[6];
  private int currentPlayer = 0;

  public boolean resolveWinnerAndRotate() {
    boolean winner = didPlayerWin();
    rotatePlayer();
    return winner;
  }

  private void rotatePlayer() {
    currentPlayer = (currentPlayer + 1) % players.size();
  }

  // --- Stub ---
  private boolean didPlayerWin() {
    return !(purses[currentPlayer] == 6);
  }
}