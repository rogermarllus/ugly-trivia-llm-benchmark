import java.util.ArrayList;

public class Amostra18_BlocoIncrementoMoedas {

  ArrayList players = new ArrayList();
  int[] purses = new int[6];
  boolean[] inPenaltyBox = new boolean[6];
  int currentPlayer = 0;
  boolean isGettingOutOfPenaltyBox;

  // Ocorrência 1: incremento de moedas dentro do bloco "na penalty box + saindo"
  public void awardCoinPenaltyBoxExit() {
    System.out.println("Answer was correct!!!!");
    incrementCurrentPlayerCoins();
  }

  // Ocorrência 2: incremento de moedas dentro do bloco "fora da penalty box"
  public void awardCoinNormal() {
    System.out.println("Answer was corrent!!!!");
    incrementCurrentPlayerCoins();
  }

  private void incrementCurrentPlayerCoins() {
    purses[currentPlayer]++;
    System.out.println(players.get(currentPlayer)
        + " now has "
        + purses[currentPlayer]
        + " Gold Coins.");
  }
}