
public class Biker {
    
    private Coordinate bikerCoordinate; //Biker position

    private BikerAI ai;
    
    private boolean isAlive;     //True if the biker is still alive

    
    
    /** Constructs a Biker object
     * @param xPos starting position in x
     * @param yPos starting position in y
     * @param ai the biker's AI
     */
    public Biker(int xPos,int yPos, BikerAI ai){
        setCoordinate(xPos, yPos);
        this.ai = ai;
        this.isAlive = true; //alive to start
    }
    
    //TODO:Implement
    public BikerActions getNextMove(BoardItem[][] board){
        return BikerActions.FORWARDS;
    } 
    
    
    /**
     * Updates biker's coordinate
     * @param x X coordinate
     * @param y Y coordinate
     */
    public void setCoordinate(int x, int y) {
        bikerCoordinate.x = x;
        bikerCoordinate.y = y;
    }
    
    /**
     * @return the bikers current coordinate
     */
    public Coordinate getCoordinate() {
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
