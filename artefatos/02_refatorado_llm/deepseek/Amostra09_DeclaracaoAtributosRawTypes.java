import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Amostra09_DeclaracaoAtributosRawTypes {

  private static final int PLAYER_COUNT = 6;

  private final List<String> players = new ArrayList<>();
  private final int[] places = new int[PLAYER_COUNT];
  private final int[] purses = new int[PLAYER_COUNT];
  private final boolean[] inPenaltyBox = new boolean[PLAYER_COUNT];

  private final LinkedList<String> popQuestions = new LinkedList<>();
  private final LinkedList<String> scienceQuestions = new LinkedList<>();
  private final LinkedList<String> sportsQuestions = new LinkedList<>();
  private final LinkedList<String> rockQuestions = new LinkedList<>();

  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;
}
