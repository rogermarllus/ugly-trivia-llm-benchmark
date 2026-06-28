import java.util.ArrayList;
import java.util.List;

public class Amostra07_MetodoWrongAnswer {
  private List<String> players = new ArrayList<>();
  private boolean[] inPenaltyBox = new boolean[6];
  private int currentPlayer = 0;

  public boolean wrongAnswer() {
    announceWrongAnswer();
    sendCurrentPlayerToPenaltyBox();
    moveToNextPlayer();
    return true;
  }

  private void announceWrongAnswer() {
    System.out.println("Question was incorrectly answered");
  }

  private void sendCurrentPlayerToPenaltyBox() {
    String playerName = players.get(currentPlayer);
    System.out.println(playerName + " was sent to the penalty box");
    inPenaltyBox[currentPlayer] = true;
  }

  private void moveToNextPlayer() {
    currentPlayer++;
    if (currentPlayer == players.size()) {
      currentPlayer = 0;
    }
  }
}
