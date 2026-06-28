import java.util.ArrayList;

public class Amostra13_BlocoSaidaPenaltyBoxDadoImpar {

  ArrayList players = new ArrayList();
  int[] places = new int[6];
  boolean[] inPenaltyBox = new boolean[6];
  int currentPlayer = 0;
  boolean isGettingOutOfPenaltyBox;

  public void rollOddWhileInPenaltyBox(int roll) {
    if (inPenaltyBox[currentPlayer]) {
      if (roll % 2 != 0) {
        isGettingOutOfPenaltyBox = true;

        System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
        movePlayer(roll);
        printPlayerLocation();
        printCurrentCategory();
        askQuestion();
      }
    }
  }

  private void movePlayer(int roll) {
    places[currentPlayer] = places[currentPlayer] + roll;
    if (places[currentPlayer] > 11) {
      places[currentPlayer] = places[currentPlayer] - 12;
    }
  }

  private void printPlayerLocation() {
    System.out.println(players.get(currentPlayer)
        + "'s new location is "
        + places[currentPlayer]);
  }

  private void printCurrentCategory() {
    System.out.println("The category is " + currentCategory());
  }

  // --- Stubs ---
  private String currentCategory() {
    return "Rock";
  }

  private void askQuestion() {
    // stub
  }
}