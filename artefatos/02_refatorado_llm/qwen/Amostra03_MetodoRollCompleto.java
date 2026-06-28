import java.util.ArrayList;

public class Amostra03_MetodoRollCompleto {

  ArrayList players = new ArrayList();
  int[] places = new int[6];
  boolean[] inPenaltyBox = new boolean[6];
  int currentPlayer = 0;
  boolean isGettingOutOfPenaltyBox;

  public void roll(int roll) {
    System.out.println(players.get(currentPlayer) + " is the current player");
    System.out.println("They have rolled a " + roll);

    if (inPenaltyBox[currentPlayer]) {
      handleRollInPenaltyBox(roll);
    } else {
      handleRollOutsidePenaltyBox(roll);
    }
  }

  private void handleRollInPenaltyBox(int roll) {
    if (roll % 2 != 0) {
      isGettingOutOfPenaltyBox = true;

      System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
      movePlayer(roll);
    } else {
      System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
      isGettingOutOfPenaltyBox = false;
    }
  }

  private void handleRollOutsidePenaltyBox(int roll) {
    movePlayer(roll);
  }

  private void movePlayer(int roll) {
    places[currentPlayer] = places[currentPlayer] + roll;
    if (places[currentPlayer] > 11) {
      places[currentPlayer] = places[currentPlayer] - 12;
    }

    System.out.println(players.get(currentPlayer)
        + "'s new location is "
        + places[currentPlayer]);
    System.out.println("The category is " + currentCategory());
    askQuestion();
  }

  // --- Stubs ---
  private String currentCategory() {
    return "Rock";
  }

  private void askQuestion() {
    // stub
  }
}