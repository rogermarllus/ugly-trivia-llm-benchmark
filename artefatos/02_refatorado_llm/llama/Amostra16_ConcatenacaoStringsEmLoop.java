import java.util.LinkedList;

public class Amostra16_ConcatenacaoStringsEmLoop {

  private LinkedList<String> popQuestions = new LinkedList<>();
  private LinkedList<String> scienceQuestions = new LinkedList<>();
  private LinkedList<String> sportsQuestions = new LinkedList<>();
  private LinkedList<String> rockQuestions = new LinkedList<>();

  public void initializeQuestions() {
    initializeQuestionsList(popQuestions, "Pop Question ");
    initializeQuestionsList(scienceQuestions, "Science Question ");
    initializeQuestionsList(sportsQuestions, "Sports Question ");
    initializeQuestionsList(rockQuestions, "Rock Question ");
  }

  private void initializeQuestionsList(LinkedList<String> questionsList, String questionPrefix) {
    for (int i = 0; i < 50; i++) {
      questionsList.addLast(questionPrefix + i);
    }
  }
}