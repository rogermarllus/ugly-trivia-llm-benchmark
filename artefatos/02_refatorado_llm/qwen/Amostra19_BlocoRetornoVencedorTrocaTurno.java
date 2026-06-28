import java.util.ArrayList;

public class Amostra19_BlocoRetornoVencedorTrocaTurno {

  ArrayList players = new ArrayList();
  int[] purses = new int[6];
  int currentPlayer = 0;

  // Ocorrência 1: dentro do bloco "na penalty box + saindo"
  public boolean resolveWinnerAndRotate_penaltyBoxExit() {
    return checkWinnerAndAdvancePlayer();
  }

  // Ocorrência 2: dentro do bloco "fora da penalty box"
  public boolean resolveWinnerAndRotate_normal() {
    return checkWinnerAndAdvancePlayer();
  }

  private boolean checkWinnerAndAdvancePlayer() {
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

  // --- Stub ---
  private boolean didPlayerWin() {
    return !(purses[currentPlayer] == 6);
  }
}