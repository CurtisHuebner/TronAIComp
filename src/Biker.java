
public class Biker {
    
    //Biker position
    public int Xposition;
    public int Yposition;
    private BikerAI ai;
    
    //True if the biker is still alive
    private boolean status;
    
    /** Constructs a Biker object
     * @param Xpos starting position in x
     * @param Ypos starting postition in y
     * @param ai the biker's AI
     */
    public Biker(int Xpos,int Ypos, BikerAI ai){
        this.Xposition = Xpos;
        this.Yposition = Ypos;
        this.ai = ai;
        this.status = true; //alive to start
    }
    
    //TODO:Implement
    public BikerActions getNextMove(BoardItem[][] board){
        return BikerActions.FORWARDS;
    }
    
    public boolean isDead(){
        return !status;
    }
}
