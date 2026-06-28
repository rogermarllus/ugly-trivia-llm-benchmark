public class Amostra06_MetodoDidPlayerWin {

  private static final int WINNING_SCORE = 6;
  private static final int NUMBER_OF_PLAYERS = 6;

  private int[] purses = new int[NUMBER_OF_PLAYERS];
  private int currentPlayer = 0;

  private boolean didPlayerWin() {
    return !hasPlayerReachedWinningScore();
  }

  private boolean hasPlayerReachedWinningScore() {
    return purses[currentPlayer] == WINNING_SCORE;
  }
}
