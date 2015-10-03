import java.util.Random;

public class TronGame {
    private BoardItem[][] board;
    private Biker[] bikers;
    
    //TODO: implement
    public TronGame(int boardSize, BikerAI[] players){
        
     
        
        
        setupBoard(boardSize);
        
    }
    /**
     * Sets up the board at the beginning of the game
     * with blanks everywhere except on the edges where
     * there will be streaks to act as walls
     * @param boardSize size of the board
     */
    private void setupBoard(int boardSize){
        board  = new BoardItem[boardSize][boardSize];
        
        //Initialize the board to blanks
        for (int i = 0;i < boardSize;i++){
            for (int j = 0;j < boardSize;j++){
                board[i][j] = BoardItem.BLANK;
            }
        }
        
        //Fill the board edges with streaks to act as walls
        //TODO: Make a faster implementation in a separate method
        for (int i = 0;i < boardSize;i++){
            for (int j = 0;j < boardSize;j++){
                
                //Check to see if the index is an edge
                if (i == 0 || (i == boardSize - 1) || j == 0 || (j == boardSize - 1)){
                    board[i][j] = BoardItem.STREAK;
                }
            }
        }        
    }
    
    private void placePlayers(BikerAI[] players) throws Exception{
        if (board == null){
            throw new Exception("You are an idiot");
        }
        
        Random generator = new Random();
        bikers = new Biker[players.length];
        
        //Initialize bikers to plausible positions
        for (int i = 0;i < players.length ;i++){
            int posX = generator.nextInt(board.length);
            int posY = generator.nextInt(board.length);
            bikers[i] = new Biker(posX,posY,players[i]);
        }
        
    }
    
    
    /**
     * Check to see if any of the players
     * are in invalid positions where an
     * in valid position is defined as being 
     * where a streak or another player should be. 
     * 
     * @return the index of the first player
     * in an invalid position or -1 if all 
     * players are in valid positions
     */
    private int checkForInvalidPos(){
        return 0; //TODO Not Implemented
    }
    
    
    //TODO: implement
    public void tick(){
        
    }
    
    public enum direction{
        NORTH,SOUTH,EAST,WEST
    }
    
    
}
