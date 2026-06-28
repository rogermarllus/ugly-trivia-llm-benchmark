public class Amostra04_MetodoCurrentCategory {

    private static final int[] POP_POSITIONS = {0, 4, 8};
    private static final int[] SCIENCE_POSITIONS = {1, 5, 9};
    private static final int[] SPORTS_POSITIONS = {2, 6, 10};
    
    private static final String POP_CATEGORY = "Pop";
    private static final String SCIENCE_CATEGORY = "Science";
    private static final String SPORTS_CATEGORY = "Sports";
    private static final String ROCK_CATEGORY = "Rock";
    
    int[] places = new int[6];
    int currentPlayer = 0    private String currentCategory() {
        int currentPlace = places[currentPlayer];
        
        if (isPositionInArray, POP_POSITIONS)) {
            return POP_CATEGORY;
        }
        
        if (isPositionInArray(currentPlace, SCIENCE_POSITIONS)) {
            return SCIENCE_CATEGORY;
        }
        
        if (isPositionInArray(currentPlace, SPORTS_POSITIONS)) {
            return SPORTS_CATEGORY;
        }
        
        return ROCK_CATEGORY;
    }
    
    private boolean isPositionInArray(int position, int[] positionsArray) {
        for (int pos : positionsArray) {
            if (position == pos) {
                return true;
            }
        }
        return false;
    }
}
