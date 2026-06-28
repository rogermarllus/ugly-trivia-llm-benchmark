import java.util.ArrayList;

public class Amostra10_MetodoIsPlayable {

    ArrayList players = new ArrayList();

    public boolean isPlayable() {
        return (howManyPlayers() >= 2);
    }

    public int howManyPlayers() {
        return players.size();
    }
}
