import java.util.ArrayList;
import java.util.LinkedList;

public class Amostra09_DeclaracaoAtributosRawTypes {

  ArrayList<Object> players = new ArrayList<>();
  int[] places = new int[6];
  int[] purses = new int[6];
  boolean[] inPenaltyBox = new boolean[6];

  LinkedList<Object> popQuestions = new LinkedList<>();
  LinkedList<Object> scienceQuestions = new LinkedList<>();
  LinkedList<Object> sportsQuestions = new LinkedList<>();
  LinkedList<Object> rockQuestions = new LinkedList<>();

  int currentPlayer = 0;
  boolean isGettingOutOfPenaltyBox;
}