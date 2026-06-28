import java.util.ArrayList;

public class Amostra14_BlocoRetencaoPenaltyBoxDadoPar {

  ArrayList players = new ArrayList();
  boolean[] inPenaltyBox = new boolean[6];
  int currentPlayer = 0;
  boolean isGettingOutOfPenaltyBox;

  public void rollEvenWhileInPenaltyBox(int roll) {
    if (inPenaltyBox[currentPlayer]) {
      if (roll % 2 != 0) {
        isGettingOutOfPenaltyBox = true;
      } else {
        System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
        isGettingOutOfPenaltyBox = false;
      }
    }
  }
}