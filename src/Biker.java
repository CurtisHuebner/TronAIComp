
public class Biker {
    
    //Biker position
    public int Xposition;
    public int Yposition;
    private BikerAI ai;
    
    //True if the biker is still alive
    private boolean isAlive;
    
    //TODO:Implement
    public Biker(int Xpos,int Ypos, BikerAI ai){
        this.Xposition = Xpos;
        this.Yposition = Ypos;
        this.ai = ai;
        this.status = true;
    }
    
    //TODO:Implement
    public BikerActions getNextMove(BoardItem[][] board){
        return BikerActions.FORWARDS;
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
