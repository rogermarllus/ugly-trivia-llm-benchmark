import java.util.LinkedList;
import java.util.List;

public class Amostra01_ConstrutorInicializacaoPerguntas {

  private final List<String> popQuestions = new LinkedList<>();
  private final List<String> scienceQuestions = new LinkedList<>();
  private final List<String> sportsQuestions = new LinkedList<>();
  private final List<String> rockQuestions = new LinkedList<>();

  private static final String POP_PREFIX = "Pop Question ";
  private static final String SCIENCE_PREFIX = "Science Question ";
  private static final String SPORTS_PREFIX = "Sports Question ";
  private static final int TOTAL_QUESTIONS = 50;

  public Amostra01_ConstrutorInicializacaoPerguntas() {
    initializeQuestions();
  }

  private void initializeQuestions() {
    for (int i = 0; i < TOTAL_QUESTIONS; i++) {
      addQuestionToCategory(popQuestions, POP_PREFIX, i);
      addQuestionToCategory(scienceQuestions, SCIENCE_PREFIX, i);
      addQuestionToCategory(sportsQuestions, SPORTS_PREFIX, i);
      rockQuestions.addLast(createRockQuestion(i));
    }
  }

  private void addQuestionToCategory(List<String> categoryList, String prefix, int index) {
    categoryList.addLast(prefix + index);
  }

  public String createRockQuestion(int index) {
    return "Rock Question " + index;
  }

  public List<String> getPopQuestions() {
    return new LinkedList<>(popQuestions);
  }

  public List<String> getScienceQuestions() {
    return new LinkedList<>(scienceQuestions);
  }

  public List<String> getSportsQuestions() {
    return new LinkedList<>(sportsQuestions);
  }

  public List<String> getRockQuestions() {
    return new LinkedList<>(rockQuestions);
  }
}
