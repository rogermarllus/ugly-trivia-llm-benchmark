import java.util.ArrayList;

public class Amostra18_BlocoIncrementoMoedas {

  private ArrayList players = new ArrayList();
  private int[] purses = new int[6];
  private boolean[] inPenaltyBox = new boolean[6];
  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public void awardCoinPenaltyBoxExit() {
    awardCoin("Answer was correct!!!!");
  }

  public void awardCoinNormal() {
    awardCoin("Answer was corrent!!!!");
  }

  private void awardCoin(String message) {
    System.out.println(message);
    purses[currentPlayer]++;
    System.out.println(players.get(currentPlayer)
        + " now has "
        + purses[currentPlayer]
        + " Gold Coins.");
  }
}
