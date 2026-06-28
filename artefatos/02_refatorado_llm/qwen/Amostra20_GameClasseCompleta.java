import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Amostra20_GameClasseCompleta {
  private static final int MAX_POSITION = 11;
  private static final int WINNING_PURSES = 6;
  private static final int BOARD_SIZE = 12;

  private final List<String> players = new ArrayList<>();
  private final int[] places = new int[BOARD_SIZE];
  private final int[] purses = new int[BOARD_SIZE];
  private final boolean[] inPenaltyBox = new boolean[BOARD_SIZE];

  private final LinkedList<String> popQuestions = new LinkedList<>();
  private final LinkedList<String> scienceQuestions = new LinkedList<>();
  private final LinkedList<String> sportsQuestions = new LinkedList<>();
  private final LinkedList<String> rockQuestions = new LinkedList<>();

  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public Amostra20_GameClasseCompleta() {
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

  public String createRockQuestion(int index) {
    return "Rock Question " + index;
  }

  public boolean isPlayable() {
    return howManyPlayers() >= 2;
  }

  public boolean add(String playerName) {
    players.add(playerName);
    int playerIndex = howManyPlayers() - 1;
    places[playerIndex] = 0;
    purses[playerIndex] = 0;
    inPenaltyBox[playerIndex] = false;

    System.out.println(playerName + " was added");
    System.out.println("They are player number " + players.size());
    return true;
  }

  public int howManyPlayers() {
    return players.size();
  }

  public void roll(int roll) {
    System.out.println(players.get(currentPlayer) + " is the current player");
    System.out.println("They have rolled a " + roll);

    if (inPenaltyBox[currentPlayer]) {
      handleRollInPenaltyBox(roll);
    } else {
      handleRollOutsidePenaltyBox(roll);
    }
  }

  private void handleRollInPenaltyBox(int roll) {
    if (roll % 2 != 0) {
      isGettingOutOfPenaltyBox = true;
      System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
      movePlayer(roll);
    } else {
      System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
      isGettingOutOfPenaltyBox = false;
    }
  }

  private void handleRollOutsidePenaltyBox(int roll) {
    movePlayer(roll);
  }

  private void movePlayer(int roll) {
    places[currentPlayer] = calculateNewPosition(places[currentPlayer], roll);
    System.out.println(players.get(currentPlayer) + "'s new location is " + places[currentPlayer]);
    System.out.println("The category is " + currentCategory());
    askQuestion();
  }

  private int calculateNewPosition(int currentPosition, int roll) {
    int newPosition = currentPosition + roll;
    if (newPosition > MAX_POSITION) {
      newPosition -= BOARD_SIZE;
    }
    return newPosition;
  }

  private void askQuestion() {
    String category = currentCategory();
    switch (category) {
      case "Pop":
        System.out.println(popQuestions.removeFirst());
        break;
      case "Science":
        System.out.println(scienceQuestions.removeFirst());
        break;
      case "Sports":
        System.out.println(sportsQuestions.removeFirst());
        break;
      case "Rock":
        System.out.println(rockQuestions.removeFirst());
        break;
    }
  }

  private String currentCategory() {
    int position = places[currentPlayer];
    if (position == 0 || position == 4 || position == 8) {
      return "Pop";
    }
    if (position == 1 || position == 5 || position == 9) {
      return "Science";
    }
    if (position == 2 || position == 6 || position == 10) {
      return "Sports";
    }
    return "Rock";
  }

  public boolean wasCorrectlyAnswered() {
    if (inPenaltyBox[currentPlayer]) {
      return handleCorrectAnswerInPenaltyBox();
    } else {
      return handleCorrectAnswerOutsidePenaltyBox();
    }
  }

  private boolean handleCorrectAnswerInPenaltyBox() {
    if (isGettingOutOfPenaltyBox) {
      System.out.println("Answer was correct!!!!");
      incrementPurse();
      boolean winner = didPlayerWin();
      advanceToNextPlayer();
      return winner;
    } else {
      advanceToNextPlayer();
      return true;
    }
  }

  private boolean handleCorrectAnswerOutsidePenaltyBox() {
    System.out.println("Answer was corrent!!!!");
    incrementPurse();
    boolean winner = didPlayerWin();
    advanceToNextPlayer();
    return winner;
  }

  private void incrementPurse() {
    purses[currentPlayer]++;
    System.out.println(players.get(currentPlayer) + " now has " + purses[currentPlayer] + " Gold Coins.");
  }

  private void advanceToNextPlayer() {
    currentPlayer++;
    if (currentPlayer == players.size()) {
      currentPlayer = 0;
    }
  }

  public boolean wrongAnswer() {
    System.out.println("Question was incorrectly answered");
    System.out.println(players.get(currentPlayer) + " was sent to the penalty box");
    inPenaltyBox[currentPlayer] = true;

    advanceToNextPlayer();
    return true;
  }

  private boolean didPlayerWin() {
    return !(purses[currentPlayer] == WINNING_PURSES);
  }
}