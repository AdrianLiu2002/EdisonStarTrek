import java.util.List;
import java.util.ArrayList;

/**
 * A Galaxy represents the game universe.
 * 
 * It will always maintain the following information:
 * 
 * test git
 * 
 *  StarDate
 *  Enterprise & its location
 *  A list of enemies (Klingons, etc)
 *  A list of Starbases
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Galaxy
{
    public Galaxy()
    {
        galaxy = new Quadrant[GameConfiguration.GALAXY_SIZE][GameConfiguration.GALAXY_SIZE];
        populate();
    }
    
    /**
     * populate the galaxy
     */
    private void populate()
    {
        for( int r=0; r<galaxy.length; r++ )
        {
            for( int c=0; c<galaxy[r].length; c++ )
            {
                galaxy[r][c] = new Quadrant();
            }
        }
    }
    
    /**
     * returns the quadrant location of the starship Enterprise
     */
    public Location getEnterprise()
    {
        return enterpriseQuadrant;
    }
    
    // fields
    private Quadrant[][] galaxy;
    private Location enterpriseQuadrant;
    private List<GamePiece> enemies;
}
