import java.util.LinkedList;

public class Amostra16_ConcatenacaoStringsEmLoop {

  private static final int QUESTION_COUNT = 50;

  private final LinkedList<String> popQuestions = new LinkedList<>();
  private final LinkedList<String> scienceQuestions = new LinkedList<>();
  private final LinkedList<String> sportsQuestions = new LinkedList<>();
  private final LinkedList<String> rockQuestions = new LinkedList<>();

  public void initializeQuestions() {
    initializeQuestionList(popQuestions, "Pop Question ");
    initializeQuestionList(scienceQuestions, "Science Question ");
    initializeQuestionList(sportsQuestions, "Sports Question ");
    initializeQuestionList(rockQuestions, "Rock Question ");
  }

  private void initializeQuestionList(LinkedList<String> questionList, String prefix) {
    for (int i = 0; i < QUESTION_COUNT; i++) {
      questionList.addLast(prefix + i);
    }
  }
}
