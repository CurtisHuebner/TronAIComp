import java.util.Random;

public class TronGame {
    private BoardItem[][] board;
    private Biker[] bikers;
    
    //TODO: implement
    public TronGame(int boardSize, BikerAI[] players){
        Random generator = new Random();
        
        board  = new BoardItem[boardSize][boardSize];
        bikers = new Biker[players.length];
        
        
        setupBoard(boardSize);
        
        
        //Initialize bikers
        for (int i = 0;i < players.length ;i++){
            int posX = generator.nextInt(boardSize);
            int posY = generator.nextInt(boardSize);
            bikers[i] = new Biker(posX,posY,players[i]);
        }
        
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
        //TODO: Make a faster implementation
        for (int i = 0;i < boardSize;i++){
            for (int j = 0;j < boardSize;j++){
                
                //Check to see if the index is an edge
                if (i == 0 || (i == boardSize - 1) || j == 0 || (j == boardSize - 1)){
                    board[i][j] = BoardItem.STREAK;
                }
            }
        }
    }
    
    //TODO: implement
    public void tick(){
        
    }
    
    public enum direction{
        NORTH,SOUTH,EAST,WEST
    }
    
    
}
