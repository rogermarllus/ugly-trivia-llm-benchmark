import java.util.ArrayList;

public class Amostra03_MetodoRollCompleto {

  private ArrayList players = new ArrayList();
  private int[] places = new int[6];
  private boolean[] inPenaltyBox = new boolean[6];
  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public void roll(int roll) {
    System.out.println(players.get(currentPlayer) + " is the current player");
    System.out.println("They have rolled a " + roll);

    if (isPlayerInPenaltyBox()) {
      handlePenaltyBoxRoll(roll);
    } else {
      handleRegularRoll(roll);
    }
  }

  private boolean isPlayerInPenaltyBox() {
    return inPenaltyBox[currentPlayer];
  }

  private void handlePenaltyBoxRoll(int roll) {
    if (isOddRoll(roll)) {
      isGettingOutOfPenaltyBox = true;
      System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
      updatePlayerPosition(roll);
    } else {
      System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
      isGettingOutOfPenaltyBox = false;
    }
  }

  private void handleRegularRoll(int roll) {
    updatePlayerPosition(roll);
  }

  private boolean isOddRoll(int roll) {
    return roll % 2 != 0;
  }

  private void updatePlayerPosition(int roll) {
    places[currentPlayer] = (places[currentPlayer] + roll) % 12;
    System.out.println(players.get(currentPlayer) + "'s new location is " + places[currentPlayer]);
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