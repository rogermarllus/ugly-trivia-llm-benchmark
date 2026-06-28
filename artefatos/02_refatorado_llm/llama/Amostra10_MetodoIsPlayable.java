import java.util.ArrayList;

public class Amostra10_MetodoIsPlayable {

  private ArrayList players = new ArrayList();

  public boolean isPlayable() {
    return hasMinimumNumberOfPlayers();
  }

  private boolean hasMinimumNumberOfPlayers() {
    return getNumberOfPlayers() >= 2;
  }

  private int getNumberOfPlayers() {
    return players.size();
  }
}