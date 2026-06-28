import java.util.ArrayList;

public class Amostra14_BlocoRetencaoPenaltyBoxDadoPar {

  private ArrayList players = new ArrayList();
  private boolean[] inPenaltyBox = new boolean[6];
  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public void rollEvenWhileInPenaltyBox(int roll) {
    if (isPlayerInPenaltyBox()) {
      handleRollWhileInPenaltyBox(roll);
    }
  }

  private boolean isPlayerInPenaltyBox() {
    return inPenaltyBox[currentPlayer];
  }

  private void handleRollWhileInPenaltyBox(int roll) {
    if (isRollOdd(roll)) {
      isGettingOutOfPenaltyBox = true;
      // jogador sai — tratado em outra amostra
    } else {
      System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
      isGettingOutOfPenaltyBox = false;
    }
  }

  private boolean isRollOdd(int roll) {
    return roll % 2 != 0;
  }
}