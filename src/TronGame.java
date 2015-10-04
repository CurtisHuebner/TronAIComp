import java.util.Random;

public class TronGame {
    
    //Fst index is X co-ord
    //Snd index is y co-ord
    private BoardItem[][] board;
    private Biker[ ] bikers;
    
    //TODO: implement
    public TronGame(int boardSize, BikerAI[] players){
        
        setupBoard(boardSize);
        placePlayers(players);
        
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
    
    /**
     * Places the players on the board in random locations
     * Goes into an infinite loop if there is no way to place
     * all players on the board
     * @param players
     * @throws Exception
     */
    private void placePlayers(BikerAI[] players){
        if (board == null){
            //Throw this if the board didn't get initialized
            throw new RuntimeException("You are an idiot");
        }
        
        Random generator = new Random();
        bikers = new Biker[players.length];
        
        //Initialize bikers to plausible positions
        for (int i = 0;i < players.length ;i++){
            int posX = generator.nextInt(board.length);
            int posY = generator.nextInt(board.length);
            bikers[i] = new Biker(posX,posY,players[i]);
        }
        
        int invalidBike = checkForInvalidPos();
        
        while (invalidBike != -1){
            int posX = generator.nextInt(board.length);
            int posY = generator.nextInt(board.length);
            
            //reset problem bike to a new position
            bikers[invalidBike].coordinate(posY, posY);
            
            //Check again for problems
            invalidBike = checkForInvalidPos();
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
      
      //Verify that no bikers are colliding with each-other.
      for (int i = 0;i < bikers.length;i++){
          for (Biker potentialCollision : bikers){
              boolean xCond = bikers[i].coordinate().x == potentialCollision.coordinate().x;
              boolean yCond = bikers[i].coordinate().y == potentialCollision.coordinate().y;
              if (xCond == yCond)
                  return i;
          }
      }
      
      //Verify that no bikers are in walls
      for (int i = 0;i < bikers.length;i++){
           int x = bikers[i].coordinate().x;
           int y = bikers[i].coordinate().y;
           
           if (board[x][y] == BoardItem.STREAK)
               return i;
      }
      
      //else
      return -1;
    }
    
    
    //TODO: implement
    public void tick(){
        
    }
    
    public enum direction{
        NORTH,SOUTH,EAST,WEST
    }
    
    
}
