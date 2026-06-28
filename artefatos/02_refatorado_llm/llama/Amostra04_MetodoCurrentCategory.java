public class Amostra04_MetodoCurrentCategory {

  private static final int[] POP_PLACES = { 0, 4, 8 };
  private static final int[] SCIENCE_PLACES = { 1, 5, 9 };
  private static final int[] SPORTS_PLACES = { 2, 6, 10 };

  int[] places = new int[6];
  int currentPlayer = 0;

  private String currentCategory() {
    if (isPopCategory())
      return "Pop";
    if (isScienceCategory())
      return "Science";
    if (isSportsCategory())
      return "Sports";
    return "Rock";
  }

  private boolean isPopCategory() {
    for (int place : POP_PLACES) {
      if (places[currentPlayer] == place)
        return true;
    }
    return false;
  }

  private boolean isScienceCategory() {
    for (int place : SCIENCE_PLACES) {
      if (places[currentPlayer] == place)
        return true;
    }
    return false;
  }

  private boolean isSportsCategory() {
    for (int place : SPORTS_PLACES) {
      if (places[currentPlayer] == place)
        return true;
    }
    return false;
  }
}