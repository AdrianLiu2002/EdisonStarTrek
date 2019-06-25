import java.util.Scanner;

/**
 * Write a description of class InputCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputCommand
{
    public InputCommand()
    {
        console = new Scanner( System.in );
    }
    
    public String[] getCommand()
    {
        System.out.print("> ");
        String input = console.nextLine();
        return input.split(" ");
    }
    
    private Scanner console;
    
    //// Test
    public static void main( String[] args )
    {
        System.out.println("Input Command Test");
        InputCommand cmd = new InputCommand();
        
        String[] tokens = cmd.getCommand();
        for(int i=0; i<tokens.length; i++) System.out.print( tokens[i] + " " );
    }
}
