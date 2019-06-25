package EdisonStarTrek;
/**
 * A GamePiece represents an object in the game
 * and the content of a sector.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GamePiece
{
    /**
     * all game pieces are pre-defined
     * all references are shared
     * all representations are exactly 3 characters long.
     */
    private GamePiece(String item)
    {
        assert item != null;
        piece = item;
    }
    
    public String toString() { return piece; }
    
    private String piece;
    
    public static final GamePiece SPACE         = new GamePiece("   ");
    public static final GamePiece STAR          = new GamePiece(" * ");
    public static final GamePiece STARBASE      = new GamePiece("+B+");
    public static final GamePiece ENTERPRISE    = new GamePiece("<E>");
    public static final GamePiece KLINGON       = new GamePiece("-K-");
    public static final GamePiece COMMANDER     = new GamePiece("!C!");
    
    public static final GamePiece[] PIECES = 
        {
            SPACE,
            STAR,
            STARBASE,
            ENTERPRISE,
            KLINGON,
            COMMANDER
        };
}
