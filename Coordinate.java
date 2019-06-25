
/**
 * These source files are proprietary & copyrighted (Edison School)
 * 
 * test git
 *
 * A Coordinate is an immutable object storing a location in space.
 * right now this is any number 1-8 for quadrants and sectors
 * 
 * The important point behind this class is that it will be used
 * to represent the UI view of a location being 1-based.
 * 
 * Whenever we use a Coordinate the x & y values must be reduced by 1
 * to map correct into the data structure (arrays) @see Galaxy, Quadrant
 * 
 * @author Mr Bradley
 * @version Summer 2019
 */
public class Coordinate
{
    public Coordinate( int x, int y )
    {
        assert x >= MIN_VALUE && x <= MAX_VALUE;
        assert y >= MIN_VALUE && y <= MAX_VALUE;
        
        this.x = x; // check range
        this.y = y; // check range
    }
    
    public String toString() { return String.format("(%d,%d)", x, y); }
    
    /**
     * returns a random Location  1 <= x <=8, and 1<= y <= 8
     */
    public static Coordinate getRandomLocation()
    {
        return new Coordinate( GameUtilities.randomValue(MAX_VALUE) + MIN_VALUE, 
                               GameUtilities.randomValue(MAX_VALUE) + MIN_VALUE );
    }
    
    // TODO: equals, compareTo
    
    public final int x, y;
    
    // TODO: use GameConfig QUADRANT_SIZE
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 8;
    
    public static void main(String[] args)
    {
        System.out.println("Coordinate test");
        Coordinate sector = Coordinate.getRandomLocation();
        System.out.println( sector );
        
    }

}
