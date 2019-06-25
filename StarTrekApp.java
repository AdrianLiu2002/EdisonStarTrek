package EdisonStarTrek;


/**
 * StarTrekApp is the main entry point to the console application.
 *
 * @author Owen, Matthew, Connor, Adrian, Mr Bradley
 * @version v0.99
 */
public class StarTrekApp
{
    /**
     * This is the main entry point for the Star Trek game
     * It's purpose is to launch the application and transfer
     * control to the Game Engine, which is responsible for managing 
     * the game state.
     */
    public static void main(String[] args)
    {
        GameUtilities.about();
        
        GameEngine game = new GameEngine();
        game.play();
        
        System.out.println("Star Trek terminated.");        
    }
}
