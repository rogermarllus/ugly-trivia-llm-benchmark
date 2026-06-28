import java.util.LinkedList;
import java.util.Queue;

public class Amostra05_MetodoAskQuestion {

  private final Queue<String> popQuestions = new LinkedList<>();
  private final Queue<String> scienceQuestions = new LinkedList<>();
  private final Queue<String> sportsQuestions = new LinkedList<>();
  private final Queue<String> rockQuestions = new LinkedList<>();

  private int[] places = new int[6];
  private int currentPlayer = 0;

  private void askQuestion() {
    String question = getQuestionForCategory(currentCategory());
    if (question != null) {
      System.out.println(question);
    }
  }

  private String getQuestionForCategory(String category) {
    switch (category) {
      case "Pop":
        return popQuestions.poll();
      case "Science":
        return scienceQuestions.poll();
      case "Sports":
        return sportsQuestions.poll();
      case "Rock":
        return rockQuestions.poll();
      default:
        return null;
    }
  }

  // --- Stub ---
  private String currentCategory() {
    return "Rock";
  }
}
