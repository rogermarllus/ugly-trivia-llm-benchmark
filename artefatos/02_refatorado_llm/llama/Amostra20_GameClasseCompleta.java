import java.util.ArrayList;
import java.util.LinkedList;

public class Amostra20_GameClasseCompleta {
  private ArrayList<String> players = new ArrayList<>();
  private int[] places = new int[6];
  private int[] purses = new int[6];
  private boolean[] inPenaltyBox = new boolean[6];

  private LinkedList<String> popQuestions = new LinkedList<>();
  private LinkedList<String> scienceQuestions = new LinkedList<>();
  private LinkedList<String> sportsQuestions = new LinkedList<>();
  private LinkedList<String> rockQuestions = new LinkedList<>();

  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  public Amostra20_GameClasseCompleta() {
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

  public boolean isPlayable() {
    return players.size() >= 2;
  }

  public boolean add(String playerName) {
    players.add(playerName);
    places[players.size() - 1] = 0;
    purses[players.size() - 1] = 0;
    inPenaltyBox[players.size() - 1] = false;

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
      if (roll % 2 != 0) {
        isGettingOutOfPenaltyBox = true;
        movePlayer(roll);
        askQuestion();
      } else {
        System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
        isGettingOutOfPenaltyBox = false;
      }
    } else {
      movePlayer(roll);
      askQuestion();
    }
  }

  private void movePlayer(int roll) {
    places[currentPlayer] = (places[currentPlayer] + roll) % 12;
    System.out.println(players.get(currentPlayer) + "'s new location is " + places[currentPlayer]);
    System.out.println("The category is " + currentCategory());
  }

  private void askQuestion() {
    String category = currentCategory();
    String question = getQuestion(category);
    System.out.println(question);
  }

  private String getQuestion(String category) {
    switch (category) {
      case "Pop":
        return popQuestions.removeFirst();
      case "Science":
        return scienceQuestions.removeFirst();
      case "Sports":
        return sportsQuestions.removeFirst();
      default:
        return rockQuestions.removeFirst();
    }
  }

  private String currentCategory() {
    int place = places[currentPlayer];
    if (place == 0 || place == 4 || place == 8) {
      return "Pop";
    } else if (place == 1 || place == 5 || place == 9) {
      return "Science";
    } else if (place == 2 || place == 6 || place == 10) {
      return "Sports";
    } else {
      return "Rock";
    }
  }

  public boolean wasCorrectlyAnswered() {
    if (inPenaltyBox[currentPlayer]) {
      if (isGettingOutOfPenaltyBox) {
        System.out.println("Answer was correct!!!!");
        purses[currentPlayer]++;
        System.out.println(players.get(currentPlayer) + " now has " + purses[currentPlayer] + " Gold Coins.");
        boolean winner = didPlayerWin();
        nextPlayer();
        return winner;
      } else {
        nextPlayer();
        return true;
      }
    } else {
      System.out.println("Answer was correct!!!!");
      purses[currentPlayer]++;
      System.out.println(players.get(currentPlayer) + " now has " + purses[currentPlayer] + " Gold Coins.");
      boolean winner = didPlayerWin();
      nextPlayer();
      return winner;
    }
  }

  public boolean wrongAnswer() {
    System.out.println("Question was incorrectly answered");
    System.out.println(players.get(currentPlayer) + " was sent to the penalty box");
    inPenaltyBox[currentPlayer] = true;
    nextPlayer();
    return true;
  }

  private void nextPlayer() {
    currentPlayer = (currentPlayer + 1) % players.size();
  }

  private boolean didPlayerWin() {
    return purses[currentPlayer] != 6;
  }
}