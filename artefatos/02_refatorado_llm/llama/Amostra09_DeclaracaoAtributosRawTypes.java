import java.util.ArrayList;
import java.util.LinkedList;

public class Amostra09_DeclaracaoAtributosRawTypes {

  private ArrayList players = new ArrayList();
  private int[] places = new int[6];
  private int[] purses = new int[6];
  private boolean[] inPenaltyBox = new boolean[6];

  private LinkedList popQuestions = new LinkedList();
  private LinkedList scienceQuestions = new LinkedList();
  private LinkedList sportsQuestions = new LinkedList();
  private LinkedList rockQuestions = new LinkedList();

  private int currentPlayer = 0;
  private boolean isGettingOutOfPenaltyBox;

  // getters e setters
  public ArrayList getPlayers() {
    return players;
  }

  public void setPlayers(ArrayList players) {
    this.players = players;
  }

  public int[] getPlaces() {
    return places;
  }

  public void setPlaces(int[] places) {
    this.places = places;
  }

  public int[] getPurses() {
    return purses;
  }

  public void setPurses(int[] purses) {
    this.purses = purses;
  }

  public boolean[] getInPenaltyBox() {
    return inPenaltyBox;
  }

  public void setInPenaltyBox(boolean[] inPenaltyBox) {
    this.inPenaltyBox = inPenaltyBox;
  }

  public LinkedList getPopQuestions() {
    return popQuestions;
  }

  public void setPopQuestions(LinkedList popQuestions) {
    this.popQuestions = popQuestions;
  }

  public LinkedList getScienceQuestions() {
    return scienceQuestions;
  }

  public void setScienceQuestions(LinkedList scienceQuestions) {
    this.scienceQuestions = scienceQuestions;
  }

  public LinkedList getSportsQuestions() {
    return sportsQuestions;
  }

  public void setSportsQuestions(LinkedList sportsQuestions) {
    this.sportsQuestions = sportsQuestions;
  }

  public LinkedList getRockQuestions() {
    return rockQuestions;
  }

  public void setRockQuestions(LinkedList rockQuestions) {
    this.rockQuestions = rockQuestions;
  }

  public int getCurrentPlayer() {
    return currentPlayer;
  }

  public void setCurrentPlayer(int currentPlayer) {
    this.currentPlayer = currentPlayer;
  }

  public boolean isGettingOutOfPenaltyBox() {
    return isGettingOutOfPenaltyBox;
  }

  public void setGettingOutOfPenaltyBox(boolean gettingOutOfPenaltyBox) {
    isGettingOutOfPenaltyBox = gettingOutOfPenaltyBox;
  }
}