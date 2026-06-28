import java.util.ArrayList;

public class Amostra07_MetodoWrongAnswer {

  private ArrayList players = new ArrayList();
  private boolean[] inPenaltyBox = new boolean[6];
  private int currentPlayer = 0;

  public boolean wrongAnswer() {
    penalizeCurrentPlayer();
    moveNextPlayer();
    return true;
  }

  private void penalizeCurrentPlayer() {
    System.out.println("Question was incorrectly answered");
    System.out.println(players.get(currentPlayer) + " was sent to the penalty box");
    inPenaltyBox[currentPlayer] = true;
  }

  private void moveNextPlayer() {
    currentPlayer = (currentPlayer + 1) % players.size();
  }
}