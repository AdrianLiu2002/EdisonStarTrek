package EdisonStarTrek;


/**
 * Game Utilities store reuseable common functions not associated
 * with a specific class.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameUtilities
{
    /**
     * prints the game version
     */
    public static void about()
    {
        System.out.println("Edison Star Trek " + gameVersion() ); 
    }
    
    private static String gameVersion()
    {
        return GameConfiguration.GAME_VERSION;
    }
    
    public static GamePiece getRandomGamePiece()
    {
        return GamePiece.PIECES[ randomValue( GamePiece.PIECES.length ) ];
    }
    
    public static int randomValue( int radix ) { return (int) (Math.random() * radix ); }
    public static int randomSector() { return randomValue( GameConfiguration.QUADRANT_SIZE ); }
    public static int randomQuadrant() { return randomValue( GameConfiguration.GALAXY_SIZE ); }
}
