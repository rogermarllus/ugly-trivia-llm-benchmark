import java.util.LinkedList;

public class Amostra17_CategoriasSemEnum {

  private static final int NUMBER_OF_PLAYERS = 6;
  private static final String POP_CATEGORY = "Pop";
  private static final String SCIENCE_CATEGORY = "Science";
  private static final String SPORTS_CATEGORY = "Sports";
  private static final String ROCK_CATEGORY = "Rock";

  int[] places = new int[NUMBER_OF_PLAYERS];
  int currentPlayer = 0;

  LinkedList popQuestions = new LinkedList();
  LinkedList scienceQuestions = new LinkedList();
  LinkedList sportsQuestions = new LinkedList();
  LinkedList rockQuestions = new LinkedList();

  private String currentCategory() {
    int playerPosition = places[currentPlayer];
    return categorizePosition(playerPosition);
  }

  private String categorizePosition(int position) {
    if (isPopPosition(position)) {
      return POP_CATEGORY;
    }
    if (isSciencePosition(position)) {
      return SCIENCE_CATEGORY;
    }
    if (isSportsPosition(position)) {
      return SPORTS_CATEGORY;
    }
    return ROCK_CATEGORY;
  }

  private boolean isPopPosition(int position) {
    return position == 0 || position == 4 || position == 8;
  }

  private boolean isSciencePosition(int position) {
    return position == 1 || position == 5 || position == 9;
  }

  private boolean isSportsPosition(int position) {
    return position == 2 || position == 6 || position == 10;
  }

  private void askQuestion() {
    String category = currentCategory();
    retrieveQuestion(category);
  }

  private void retrieveQuestion(String category) {
    switch (category) {
      case POP_CATEGORY:
        System.out.println(popQuestions.removeFirst());
        break;
      case SCIENCE_CATEGORY:
        System.out.println(scienceQuestions.removeFirst());
        break;
      case SPORTS_CATEGORY:
        System.out.println(sportsQuestions.removeFirst());
        break;
      case ROCK_CATEGORY:
        System.out.println(rockQuestions.removeFirst());
        break;
    }
  }
}
