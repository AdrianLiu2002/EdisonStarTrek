package EdisonStarTrek;


/**
 * A Location is a Quadrant/Sector pairing
 * A Location is immutable
 *
 * @author Mr Bradley
 * @version v0.99
 */
public class Location
{
    public Location( Coordinate quadrant, Coordinate sector)
    {
        assert quadrant != null;
        assert sector != null;

        this.quadrant = quadrant;
        this.sector = sector;
    }

    public String toString() 
    {
        return String.format("[Q%s, S%s]", quadrant, sector); 
    }

    public final Coordinate quadrant;
    public final Coordinate sector;

    public static Location getRandomLocation()
    {
        Coordinate quadrant = new Coordinate(GameUtilities.randomValue(Coordinate.MAX_VALUE) + Coordinate.MIN_VALUE, 
                GameUtilities.randomValue(Coordinate.MAX_VALUE) + Coordinate.MIN_VALUE );

        Coordinate sector =   new Coordinate(GameUtilities.randomValue(Coordinate.MAX_VALUE) + Coordinate.MIN_VALUE, 
                GameUtilities.randomValue(Coordinate.MAX_VALUE) + Coordinate.MIN_VALUE );

        return new Location( quadrant, sector );
    }

    public static void main(String[] args)
    {
        System.out.println("Location test");
        Location galacticLocation = Location.getRandomLocation();
        System.out.println( galacticLocation );

    }
}
