import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Amostra20_GameClasseCompleta {
  private static final int BOARD_SIZE = 12;
  private static final int WINNING_PURSE_COUNT = 6;
  private static final int MAX_PLAYERS = 6;

  private final List<String> players = new ArrayList<>();
  private final int[] places = new int[MAX_PLAYERS];
  private final int[] purses = new int[MAX_PLAYERS];
  private final boolean[] inPenaltyBox = new boolean[MAX_PLAYERS];

  private final LinkedList<String> popQuestions = new LinkedList<>();
  private final LinkedList<String> scienceQuestions = new LinkedList<>();
  private final LinkedList<String> sportsQuestions = new LinkedList<>();
  private final LinkedList<String> rockQuestions = new LinkedList<>();

  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public Amostra20_GameClasseCompleta() {
    initializeQuestionDecks();
  }

  private void initializeQuestionDecks() {
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
    int playerIndex = howManyPlayers();
    places[playerIndex] = 0;
    purses[playerIndex] = 0;
    inPenaltyBox[playerIndex] = false;

    announcePlayerAddition(playerName);
    return true;
  }

  private void announcePlayerAddition(String playerName) {
    System.out.println(playerName + " was added");
    System.out.println("They are player number " + players.size());
  }

  public int howManyPlayers() {
    return players.size();
  }

  public void roll(int roll) {
    announceCurrentPlayerAndRoll(roll);

    if (isCurrentPlayerInPenaltyBox()) {
      handlePenaltyBoxRoll(roll);
    } else {
      handleNormalRoll(roll);
    }
  }

  private void announceCurrentPlayerAndRoll(int roll) {
    System.out.println(players.get(currentPlayer) + " is the current player");
    System.out.println("They have rolled a " + roll);
  }

  private boolean isCurrentPlayerInPenaltyBox() {
    return inPenaltyBox[currentPlayer];
  }

  private void handlePenaltyBoxRoll(int roll) if (roll % 2 != 0) {
            isGettingOutOfPenaltyBox = true;
            System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
            updatePlayerPosition(roll);
        } else {
            System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
            isGettingOutOfPenaltyBox = false;
        }
    }

  private void handleNormalRoll(int roll) {
    updatePlayerPosition(roll);
  }

  private void updatePlayerPosition(int roll) {
    places[currentPlayer] = (places[currentPlayer] + roll) % BOARD_SIZE;
    announceNewPosition();
    askQuestion();
  }

  private void announceNewPosition() {
    System.out.println(players.get(currentPlayer) + "'s new location is " + places[currentPlayer]);
    System.out.println("The category is " + currentCategory());
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

    if (position % 4 == 0)
      return "Pop";
    if (position % 4 == 1)
      return "Science";
    if (position % 4 == 2)
      return "Sports";
    return "Rock";
  }

  boolean wasCorrectlyAnswered() {
    if (isCurrentPlayerInPenaltyBox()) {
      return handlePenaltyBoxCorrectAnswer();
    } else {
      return handleNormalCorrectAnswer();
    }
  }

  private boolean handlePenaltyBoxCorrectAnswer() {
    if (isGettingOutOfPenaltyBox) {
      awardCoinToCurrentPlayer();
      return advanceToNextPlayerAndCheckWin();
    } else {
      advanceToNextPlayer();
      return true;
    }
  }

  private boolean handleNormalCorrectAnswer() {
    System.out.println("Answer was correct!!!!");
    awardCoinToCurrentPlayer();
    return advanceToNextPlayerAndCheckWin();
  }

  private void awardCoinToCurrentPlayer() {
    purses[currentPlayer]++;
    System.out.println(players.get(currentPlayer) + " now has " + purses[currentPlayer] + " Gold Coins.");
  }

  private boolean advanceToNextPlayerAndCheckWin() {
    boolean winner = didPlayerWin();
    advanceToNextPlayer();
    return winner;
  }

  private void advanceToNextPlayer() {
    currentPlayer = (currentPlayer + 1) % players.size();
  }

  public boolean wrongAnswer() {
    System.out.println("Question was incorrectly answered");
    System.out.println(players.get(currentPlayer) + " was sent to the penalty box");
    inPenaltyBox[currentPlayer] = true;

    advanceToNextPlayer();
    return true;
  }

  private boolean didPlayerWin() {
    return purses[currentPlayer] != WINNING_PURSE_COUNT;
  }
}
