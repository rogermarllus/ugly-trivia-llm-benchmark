public class Amostra11_LogicaAvancaoTabuleiroCircular {
  private static final int BOARD_SIZE = 12;
  private static final int PLAYER_COUNT = 6;

  private int[] places = new int[PLAYER_COUNT];
  private int currentPlayer = 0;

  public void advancePlayer(int roll) {
    int newPosition = calculateNewPosition(roll);
    places[currentPlayer] = newPosition;
  }

  private int calculateNewPosition(int roll) {
    int currentPosition = places[currentPlayer];
    int rawPosition = currentPosition + roll;
    return normalizePosition(rawPosition);
  }

  private int normalizePosition(int position) {
    if (position >= BOARD_SIZE) {
      return position % BOARD_SIZE;
    }
    return position;
  }

  public int[] getPlaces() {
    return places.clone();
  }

  public int getCurrentPlayer() {
    return currentPlayer;
  }

  public void setCurrentPlayer(int currentPlayer) {
    if (currentPlayer >= 0 && currentPlayer < PLAYER_COUNT) {
      this.currentPlayer = currentPlayer;
    }
  }
}
