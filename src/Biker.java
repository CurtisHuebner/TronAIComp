
public class Biker {
    
    //Biker position
    public int Xposition;
    public int Yposition;
    private BikerAI ai;
    
    //True if the biker is still alive
    private boolean status;
    
    //TODO:Implement
    public Biker(int Xpos,int Ypos, BikerAI ai){
        
    }
    
    //TODO:Implement
    public BikerActions getNextMove(BoardItem[][] board){
        return BikerActions.FORWARDS;
    }

    public boolean isDead(){
        return !status;
    }
}
