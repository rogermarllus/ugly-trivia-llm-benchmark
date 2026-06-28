import java.util.LinkedList;

public class Amostra05_MetodoAskQuestion {

  private LinkedList<String> popQuestions = new LinkedList<>();
  private LinkedList<String> scienceQuestions = new LinkedList<>();
  private LinkedList<String> sportsQuestions = new LinkedList<>();
  private LinkedList<String> rockQuestions = new LinkedList<>();

  private int[] places = new int[6];
  private int currentPlayer = 0;

  private void askQuestion() {
    String category = currentCategory();
    LinkedList<String> questions = getQuestionsByCategory(category);
    if (!questions.isEmpty()) {
      System.out.println(questions.removeFirst());
    }
  }

  private LinkedList<String> getQuestionsByCategory(String category) {
    return switch (category) {
      case "Pop" -> popQuestions;
      case "Science" -> scienceQuestions;
      case "Sports" -> sportsQuestions;
      case "Rock" -> rockQuestions;
      default -> new LinkedList<>();
    };
  }

  // --- Stub ---
  private String currentCategory() {
    return "Rock";
  }
}