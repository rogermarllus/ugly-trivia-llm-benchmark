public class Amostra06_MetodoDidPlayerWin {

  private final int[] purses = new int[6];
  private int currentPlayer = 0;

  private boolean didPlayerWin() {
    return purses[currentPlayer] != 6;
  }
}