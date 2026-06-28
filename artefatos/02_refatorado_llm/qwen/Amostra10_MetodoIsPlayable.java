import java.util.ArrayList;
import java.util.List;

public class Amostra10_MetodoIsPlayable {

  private final List players = new ArrayList();

  public boolean isPlayable() {
    return howManyPlayers() >= 2;
  }

  public int howManyPlayers() {
    return players.size();
  }
}