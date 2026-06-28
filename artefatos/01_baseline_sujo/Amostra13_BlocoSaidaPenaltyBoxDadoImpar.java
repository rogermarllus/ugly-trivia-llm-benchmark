import java.util.ArrayList;

public class Amostra13_BlocoSaidaPenaltyBoxDadoImpar {

    ArrayList players = new ArrayList();
    int[] places = new int[6];
    boolean[] inPenaltyBox = new boolean[6];
    int currentPlayer = 0;
    boolean isGettingOutOfPenaltyBox;

    public void rollOddWhileInPenaltyBox(int roll) {
        if (inPenaltyBox[currentPlayer]) {
            if (roll % 2 != 0) {
                isGettingOutOfPenaltyBox = true;

                System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
                places[currentPlayer] = places[currentPlayer] + roll;
                if (places[currentPlayer] > 11)
                    places[currentPlayer] = places[currentPlayer] - 12;

                System.out.println(players.get(currentPlayer)
                        + "'s new location is "
                        + places[currentPlayer]);
                System.out.println("The category is " + currentCategory());
                askQuestion();
            }
        }
    }

    // --- Stubs ---
    private String currentCategory() {
        return "Rock";
    }

    private void askQuestion() {
        // stub
    }
}
