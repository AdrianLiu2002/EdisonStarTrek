package EdisonStarTrek;

import java.lang.StringBuilder;

/**
 * A Quadrant is the main display area for the game and
 * consists of a grid of Sectors that hold game pieces.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quadrant
{
    public Quadrant()
    {
         quadrant = new Sector[GameConfiguration.QUADRANT_SIZE+2][GameConfiguration.QUADRANT_SIZE+2]; // tesing sizes other than 8
        //quadrant = new Sector[GameConfiguration.QUADRANT_SIZE][GameConfiguration.QUADRANT_SIZE];
        populate();
    }

    private void populate()
    {
        for( int r=0; r<quadrant.length; r++ )
        {
            for( int c=0; c<quadrant[r].length; c++ )
            {
                quadrant[r][c] = new Sector( GameUtilities.getRandomGamePiece() );
            }
        }        
    }

    /**
     * Whenever we use a Location this is the UI 1-based representation
     * the x & y values need to be reduced by 1
     * 
     * This forms the UI/Data interface contract for mapping locations 
     * 
     * @return Sector at the specified location
     */
    public Sector get( Coordinate sector )
    {
        return quadrant[sector.x-1][sector.y-1];
    }
    
    /**
     * build and display the quadrant table
     */
    public void display()
    {
        final String[] displayTable = buildDisplayTable();
        for(int i=0; i<displayTable.length; i++) System.out.println( displayTable[i] );
    }
    
    private String[] buildDisplayTable()
    {
        final String HEADER = HEADER();         //   "     1   2   3   4   5   6   7   8  "; 
        final String SEPARATOR = SEPARATOR();   //   "   +---+---+---+---+---+---+---+---+";
        
        // each row consists of a data row followed by a separator
        // in addition there are two rows used in the header
        String[] table = new String[ quadrant.length * 2 + 2 ];
        table[0] = HEADER;
        table[1] = SEPARATOR;
        
        for(int r=0; r<quadrant.length; r++)
        {
            StringBuilder row = new StringBuilder( QUADRANT_DISPLAY_WIDTH );
            row.append(String.format("%2d |", r+1) );
            for(int c=0; c<quadrant[r].length; c++)
            {
                row.append( quadrant[r][c].toString() );
                row.append("|");
            }
            table[r*2+2] = row.toString();
            table[r*2+3] = SEPARATOR;
        }
        return table;
    }

    private String HEADER()
    {
        final String SPACES = SPACES(COLUMN_WIDTH);
        final String FORMAT = "%" + COLUMN_WIDTH + "d ";
        
        StringBuilder sb = new StringBuilder( QUADRANT_DISPLAY_WIDTH );
        sb.append(SPACES);
        for(int i=0; i<quadrant[0].length; i++)
        {
            sb.append( String.format(FORMAT, i+1) );
        }
        return sb.toString();
    }
    
    private String SEPARATOR()
    {
        StringBuilder sb = new StringBuilder( QUADRANT_DISPLAY_WIDTH );
        sb.append("   +");
        for(int i=0; i<quadrant[0].length; i++)
        {
            sb.append("---+");
        }
        return sb.toString();
    }
    
    private String SPACES( int n )
    {
        StringBuilder sb = new StringBuilder(n);
        for(int i=0; i<n; i++) sb.append(" ");
        return sb.toString();
    }
    
    // instance variables
    private Sector[][] quadrant;

    // class variables
    
    // class constants
    private static final int COLUMN_WIDTH=3;         // column content width excluding borders
    private static final int QUADRANT_DISPLAY_WIDTH = (GameConfiguration.QUADRANT_SIZE + 1) * (COLUMN_WIDTH + 1);

    
    //// test
    public static void main(String[] args)
    {
        Quadrant q = new Quadrant();
        q.display();
    }

}
