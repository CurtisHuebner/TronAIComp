

public interface BikerAI {
    /**
     * Inquiry to the player AIs as to which move they are going to take based on the current state of the board.
     * @param view The current state of the board. 
     * @return the players decision as to where to go (forward, left or right) 
     */
    public BikerActions getNextAction(BoardItem[][] view);
    
}
