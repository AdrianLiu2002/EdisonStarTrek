
/**
 * GameEngine coordinates the playing of the game.
 *
 * @author Owen, Matthew, Connor, Adrian, Mr Bradley
 * @version 0.99
 */
public class GameEngine
{
    /**
     * TBD
     */
    public GameEngine()
    {
        galaxy = new Galaxy();
    }
    
    /**
     * manages the play cycle of the game: win, loss, termination
     */
    public void play()
    {
        System.out.println("Starting game...");
        
        /*
         * while( !gameOver() )
         * {
         *     executeCommand( getCommand() );  // performs action & updates time
         *     computerPlay();                  // enemy actions
         * }
         * 
         * displayGameResult();                 // win, lose, terminate
         * displayGameStats();                  // display game stats 
         */
        System.out.println("Thanks for playing.");
    }
    
    public Galaxy galaxy()
    {
        return galaxy;
    }
    
    /* **************************************************************
     *      GAME STATE DATA
     * **************************************************************/
     
    // Win condition:   Required # of Klingons destroyed
    // Loss condition:  Enterprise destroyed
    //                  Time expired
    // Termination:     Player terminates the game
    
    // StarDate
    // Enterprise
    // EnemyShips (Klingons, Romulans, Thelonians, etc.)
    // StarBase
    // Galaxy, Quadrant, Sector, GamePiece
    // InputCommand
    
    Galaxy galaxy;
}
