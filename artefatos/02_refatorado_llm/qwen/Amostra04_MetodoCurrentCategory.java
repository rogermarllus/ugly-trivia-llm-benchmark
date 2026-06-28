public class Amostra04_MetodoCurrentCategory {

  int[] places = new int[6];
  int currentPlayer = 0;

  private String currentCategory() {
    int position = places[currentPlayer];

    if (isPopCategory(position)) {
      return "Pop";
    }
    if (isScienceCategory(position)) {
      return "Science";
    }
    if (isSportsCategory(position)) {
      return "Sports";
    }
    return "Rock";
  }

  private boolean isPopCategory(int position) {
    return position == 0 || position == 4 || position == 8;
  }

  private boolean isScienceCategory(int position) {
    return position == 1 || position == 5 || position == 9;
  }

  private boolean isSportsCategory(int position) {
    return position == 2 || position == 6 || position == 10;
  }
}