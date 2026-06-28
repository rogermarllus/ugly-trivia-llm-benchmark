import java.util.LinkedList;

public class Amostra05_MetodoAskQuestion {

  LinkedList popQuestions = new LinkedList();
  LinkedList scienceQuestions = new LinkedList();
  LinkedList sportsQuestions = new LinkedList();
  LinkedList rockQuestions = new LinkedList();

  int[] places = new int[6];
  int currentPlayer = 0;

  private void askQuestion() {
    String category = currentCategory();

    if (category == "Pop")
      System.out.println(popQuestions.removeFirst());
    if (category == "Science")
      System.out.println(scienceQuestions.removeFirst());
    if (category == "Sports")
      System.out.println(sportsQuestions.removeFirst());
    if (category == "Rock")
      System.out.println(rockQuestions.removeFirst());
  }

  // --- Stub ---
  private String currentCategory() {
    return "Rock";
  }
}