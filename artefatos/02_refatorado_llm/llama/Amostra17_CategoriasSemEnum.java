import java.util.LinkedList;

public class Amostra17_CategoriasSemEnum {

  private static final int[] CATEGORY_PLACES = { 0, 1, 2, 4, 5, 6, 8, 9, 10 };
  private static final String[] CATEGORIES = { "Pop", "Science", "Sports", "Rock" };

  private int[] places = new int[6];
  private int currentPlayer = 0;

  private LinkedList<String> popQuestions = new LinkedList<>();
  private LinkedList<String> scienceQuestions = new LinkedList<>();
  private LinkedList<String> sportsQuestions = new LinkedList<>();
  private LinkedList<String> rockQuestions = new LinkedList<>();

  private String currentCategory() {
    int place = places[currentPlayer];
    if (place == 0 || place == 4 || place == 8)
      return "Pop";
    if (place == 1 || place == 5 || place == 9)
      return "Science";
    if (place == 2 || place == 6 || place == 10)
      return "Sports";
    return "Rock";
  }

  private void askQuestion() {
    String category = currentCategory();
    LinkedList<String> questions = getQuestions(category);
    System.out.println(questions.removeFirst());
  }

  private LinkedList<String> getQuestions(String category) {
    switch (category) {
      case "Pop":
        return popQuestions;
      case "Science":
        return scienceQuestions;
      case "Sports":
        return sportsQuestions;
      default:
        return rockQuestions;
    }
  }
}