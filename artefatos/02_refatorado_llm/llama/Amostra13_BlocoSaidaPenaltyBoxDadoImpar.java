import java.util.ArrayList;

public class Amostra13_BlocoSaidaPenaltyBoxDadoImpar {

  private ArrayList players = new ArrayList();
  private int[] places = new int[6];
  private boolean[] inPenaltyBox = new boolean[6];
  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public void rollOddWhileInPenaltyBox(int roll) {
    if (isPlayerInPenaltyBox() && isRollOdd(roll)) {
      isGettingOutOfPenaltyBox = true;
      updatePlayerLocation(roll);
      printPlayerNewLocation();
      printCategoryAndAskQuestion();
    }
  }

  private boolean isPlayerInPenaltyBox() {
    return inPenaltyBox[currentPlayer];
  }

  private boolean isRollOdd(int roll) {
    return roll % 2 != 0;
  }

  private void updatePlayerLocation(int roll) {
    System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
    places[currentPlayer] = calculateNewLocation(places[currentPlayer], roll);
  }

  private int calculateNewLocation(int currentLocation, int roll) {
    int newLocation = currentLocation + roll;
    return newLocation > 11 ? newLocation - 12 : newLocation;
  }

  private void printPlayerNewLocation() {
    System.out.println(players.get(currentPlayer) + "'s new location is " + places[currentPlayer]);
  }

  private void printCategoryAndAskQuestion() {
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