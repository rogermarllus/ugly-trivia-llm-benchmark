import java.util.LinkedList;

public class Amostra17_CategoriasSemEnum {

    int[] places = new int[6];
    int currentPlayer = 0;

    LinkedList popQuestions = new LinkedList();
    LinkedList scienceQuestions = new LinkedList();
    LinkedList sportsQuestions = new LinkedList();
    LinkedList rockQuestions = new LinkedList();

    private String currentCategory() {
        if (places[currentPlayer] == 0)
            return "Pop";
        if (places[currentPlayer] == 4)
            return "Pop";
        if (places[currentPlayer] == 8)
            return "Pop";
        if (places[currentPlayer] == 1)
            return "Science";
        if (places[currentPlayer] == 5)
            return "Science";
        if (places[currentPlayer] == 9)
            return "Science";
        if (places[currentPlayer] == 2)
            return "Sports";
        if (places[currentPlayer] == 6)
            return "Sports";
        if (places[currentPlayer] == 10)
            return "Sports";
        return "Rock";
    }

    private void askQuestion() {
        if (currentCategory() == "Pop")
            System.out.println(popQuestions.removeFirst());
        if (currentCategory() == "Science")
            System.out.println(scienceQuestions.removeFirst());
        if (currentCategory() == "Sports")
            System.out.println(sportsQuestions.removeFirst());
        if (currentCategory() == "Rock")
            System.out.println(rockQuestions.removeFirst());
    }
}
