import java.util.LinkedList;

public class Amostra01_ConstrutorInicializacaoPerguntas {

    private LinkedList<String> popQuestions = new LinkedList<>();
    private LinkedList<String> scienceQuestions = new LinkedList<>();
    private LinkedList<String> sportsQuestions = new LinkedList<>();
    private LinkedList<String> rockQuestions = new LinkedList<>();

    public Amostra01_ConstrutorInicializacaoPerguntas() {
        initializeQuestions();
    }

    private void initializeQuestions() {
        for (int i = 0; i < 50; i++) {
            popQuestions.addLast("Pop Question " + i);
            scienceQuestions.addLast("Science Question " + i);
            sportsQuestions.addLast("Sports Question " + i);
            rockQuestions.addLast(createRockQuestion(i));
        }
    }

    private String createRockQuestion(int index) {
        return "Rock Question " + index;
    }
}