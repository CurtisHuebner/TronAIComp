
public class Biker {
    
    private long WAIT_TIME_MILLIS = 10;
    //Biker position
    public int Xposition;
    public int Yposition;
    private BikerAI ai;
    
    //True if the biker is still alive
    private boolean isAlive;
    
    /** Constructs a Biker object
     * @param Xpos starting position in x
     * @param Ypos starting position in y
     * @param ai the biker's AI
     */
    public Biker(int Xpos,int Ypos, BikerAI ai){
        this.Xposition = Xpos;
        this.Yposition = Ypos;
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
