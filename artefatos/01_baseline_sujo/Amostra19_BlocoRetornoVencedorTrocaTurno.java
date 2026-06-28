import java.util.ArrayList;

public class Amostra19_BlocoRetornoVencedorTrocaTurno {

    ArrayList players = new ArrayList();
    int[] purses = new int[6];
    int currentPlayer = 0;

    // Ocorrência 1: dentro do bloco "na penalty box + saindo"
    public boolean resolveWinnerAndRotate_penaltyBoxExit() {
        boolean winner = didPlayerWin();
        currentPlayer++;
        if (currentPlayer == players.size())
            currentPlayer = 0;
        return winner;
    }

    // Ocorrência 2: dentro do bloco "fora da penalty box"
    public boolean resolveWinnerAndRotate_normal() {
        boolean winner = didPlayerWin();
        currentPlayer++;
        if (currentPlayer == players.size())
            currentPlayer = 0;
        return winner;
    }

    // --- Stub ---
    private boolean didPlayerWin() {
        return !(purses[currentPlayer] == 6);
    }
}
