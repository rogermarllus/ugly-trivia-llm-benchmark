import java.util.ArrayList;

public class Amostra12_DuplicacaoRotacaoTurnos {

  ArrayList players = new ArrayList();
  int[] purses = new int[6];
  boolean[] inPenaltyBox = new boolean[6];
  int currentPlayer = 0;
  boolean isGettingOutOfPenaltyBox;

  // Ocorrência 1: rotação de turno dentro do bloco "na penalty box + saindo"
  public boolean wasCorrectlyAnswered_penaltyBoxExit() {
    boolean winner = didPlayerWin();
    advanceCurrentPlayer();
    return winner;
  }

  // Ocorrência 2: rotação de turno dentro do bloco "na penalty box +
  // permanecendo"
  public boolean wasCorrectlyAnswered_penaltyBoxStay() {
    advanceCurrentPlayer();
    return true;
  }

  // Ocorrência 3: rotação de turno dentro do bloco "fora da penalty box"
  public boolean wasCorrectlyAnswered_normal() {
    boolean winner = didPlayerWin();
    advanceCurrentPlayer();
    return winner;
  }

  // Ocorrência 4: rotação de turno dentro de wrongAnswer
  public boolean wrongAnswer() {
    inPenaltyBox[currentPlayer] = true;
    advanceCurrentPlayer();
    return true;
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