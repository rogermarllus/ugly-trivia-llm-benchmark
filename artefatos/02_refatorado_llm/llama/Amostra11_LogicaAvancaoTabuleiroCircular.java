public class Amostra11_LogicaAvancaoTabuleiroCircular {

  private static final int TOTAL_PLACES = 12;
  private int[] places = new int[6];
  private int currentPlayer = 0;

  public void advancePlayer(int roll) {
    places[currentPlayer] = (places[currentPlayer] + roll) % TOTAL_PLACES;
  }
}