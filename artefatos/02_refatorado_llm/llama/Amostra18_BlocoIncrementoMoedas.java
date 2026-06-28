import java.util.ArrayList;

public class Amostra18_BlocoIncrementoMoedas {

  private ArrayList players = new ArrayList();
  private int[] purses = new int[6];
  private boolean[] inPenaltyBox = new boolean[6];
  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  private void awardCoin() {
    purses[currentPlayer]++;
    System.out.println(players.get(currentPlayer)
        + " now has "
        + purses[currentPlayer]
        + " Gold Coins.");
  }

  public void awardCoinPenaltyBoxExit() {
    System.out.println("Answer was correct!!!!");
    awardCoin();
  }

  public void awardCoinNormal() {
    System.out.println("Answer was correct!!!!");
    awardCoin();
  }
}