public class Amostra11_LogicaAvancaoTabuleiroCircular {

  int[] places = new int[6];
  int currentPlayer = 0;

  public void advancePlayer(int roll) {
    places[currentPlayer] += roll;
    if (places[currentPlayer] > 11) {
      places[currentPlayer] -= 12;
    }
  }
}