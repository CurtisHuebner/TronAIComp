import java.util.Random;

public class TronGame {
    private BoardItem[][] board;
    private Biker[] bikers;
    
    //TODO: implement
    public TronGame(int boardSize, BikerAI[] players){
        Random generator = new Random();
        
        board  = new BoardItem[boardSize][boardSize];
        bikers = new Biker[players.length];
        
        
        //Initialize the board
        for (int i = 0;i < boardSize;i++){
            for (int j = 0;j < boardSize;j++){
                board[i][j] = BoardItem.BLANK;
            }
        }
        
        //Initialize bikers
        for (int i = 0;i < players.length ;i++){
            int posX = generator.nextInt(boardSize);
            int posY = generator.nextInt(boardSize);
            bikers[i] = new Biker(posX,posY,players[i]);
        }
        
    }
    
    //TODO: implement
    public void tick(){
        
    }
    
    public enum direction{
        NORTH,SOUTH,EAST,WEST
    }
    
    
}
