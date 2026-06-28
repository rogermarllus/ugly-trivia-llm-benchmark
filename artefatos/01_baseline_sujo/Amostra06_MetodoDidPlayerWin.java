public class Amostra06_MetodoDidPlayerWin {

    int[] purses = new int[6];
    int currentPlayer = 0;

    private boolean didPlayerWin() {
        return !(purses[currentPlayer] == 6);
    }
}
