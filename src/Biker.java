
public class Biker {
    

    private long WAIT_TIME_MILLIS = 10;

    private Coordinate bikerCoordinate;     //Biker position

    private BikerAI ai;
    
    private boolean isAlive = true;                //True if the biker is still alive

    
    /** Constructs a Biker object
     * @param xPos starting position in x
     * @param yPos starting position in y
     * @param ai the biker's AI
     */
    public Biker(int xPos,int yPos, BikerAI ai){
        coordinate(xPos, yPos);
        this.ai = ai;
        this.isAlive = true; //alive to start
    }
    
    /** retrieves the next move of the biker, from it's AI. 
     * This should implement a time limit in the future!
     * @param board : the current board, 
     *        aligned such that the bike has been previously moving upwards
     * @return nextAction : the decision of the Biker's AI in terms of direction to move
     */
    public BikerActions getNextMove(BoardItem[][] board){
        BikerActions nextAction = ai.getNextAction(board);
        return nextAction;
    } 
 
    
    
    
    /**
     * Updates biker's coordinate
     * @param x X coordinate
     * @param y Y coordinate
     */
    public void coordinate(int x, int y) {
        bikerCoordinate.x = x;
        bikerCoordinate.y = y;
    }
    
    /**
     * @return the bikers current coordinate
     */
    public Coordinate coordinate() {
        return bikerCoordinate;
    }
    
    
    /**
     * sets the status of the Biker to dead
     */
    public void murder() {
        isAlive = false;
    }
    
    /**
     * getter for life status of Biker
     * @return true if biker is alive.
     */
    public boolean isAlive(){
        return isAlive;
    }
}
