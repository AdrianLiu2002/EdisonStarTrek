package EdisonStarTrek;
/**
 * A Sector contains game pieces.
 * Only a single game piece may occupy a given sector
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sector
{
    public Sector()
    {
        this( GamePiece.SPACE ); 
    }
    
    public Sector( GamePiece item )
    {
        assert item!= null;
        content = item;
    }
    
    public GamePiece content() { return content; }
    public String toString() { return content.toString(); }
        
    private GamePiece content;
    
    /// testing
    public static void main(String[] args)
    {
        System.out.println( "Default:    " + new Sector() );         // DEFAULT (SPACE)
        System.out.println( "Space:      " + GamePiece.SPACE );      // SPACE
        System.out.println( "Star:       " + GamePiece.STAR );       // STAR
        System.out.println( "Starbase:   " + GamePiece.STARBASE );   // STARBASE
        System.out.println( "Enterprise: " + GamePiece.ENTERPRISE ); // ENTERPRISE
        System.out.println( "Klingon:    " + GamePiece.KLINGON );    // KLINGON
        System.out.println( "Commander:  " + GamePiece.COMMANDER );  // COMMANDER
        
        
        
    }
}
