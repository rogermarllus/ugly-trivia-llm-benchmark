import java.util.ArrayList;

public class Amostra07_MetodoWrongAnswer {

  ArrayList players = new ArrayList();
  boolean[] inPenaltyBox = new boolean[6];
  int currentPlayer = 0;

  public boolean wrongAnswer() {
    System.out.println("Question was incorrectly answered");
    System.out.println(players.get(currentPlayer) + " was sent to the penalty box");
    inPenaltyBox[currentPlayer] = true;

    advanceCurrentPlayer();
    return true;
  }

  private void advanceCurrentPlayer() {
    currentPlayer++;
    if (currentPlayer == players.size()) {
      currentPlayer = 0;
    }
  }
}