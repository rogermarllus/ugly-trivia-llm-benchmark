import java.util.ArrayList;
import java.util.List;

public class Amostra10_MetodoIsPlayable {

  private final List<String> players;

  public Amostra10_MetodoIsPlayable() {
    this.players = new ArrayList<>();
  }

  public boolean isPlayable() {
    return howManyPlayers() >= 2;
  }

  public int howManyPlayers() {
    return players.size();
  }

  public void addPlayer(String player) {
    players.add(player);
  }

  public boolean removePlayer(String player) {
    return players.remove(player);
  }

  public List<String> getPlayers() {
    return new ArrayList<>(players);
  }
}
