import java.util.LinkedList;

public class Amostra01_ConstrutorInicializacaoPerguntas {

  LinkedList popQuestions = new LinkedList();
  LinkedList scienceQuestions = new LinkedList();
  LinkedList sportsQuestions = new LinkedList();
  LinkedList rockQuestions = new LinkedList();

  public Amostra01_ConstrutorInicializacaoPerguntas() {
    initializeQuestions();
  }

  private void initializeQuestions() {
    for (int i = 0; i < 50; i++) {
      popQuestions.addLast("Pop Question " + i);
      scienceQuestions.addLast(("Science Question " + i));
      sportsQuestions.addLast(("Sports Question " + i));
      rockQuestions.addLast(createRockQuestion(i));
    }
  }

  public String createRockQuestion(int index) {
    return "Rock Question " + index;
  }
}